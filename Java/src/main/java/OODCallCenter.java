import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

enum Rank
{
	Responder (0),
	Manager (1),
	Director (2);

	private int value;

	private Rank(int v)
	{
		value = v;
	}

	public int getValue()
	{
		return value;
	}
}

abstract class Employee 
{
	private Call currentCall = null;
	protected Rank rank;

	public Employee()
	{}

	public void receiveCall(Call call)
	{
		currentCall = call;
	}

	public void callCompleted()
	{
		if(currentCall != null)
		{
			currentCall.disconnect();
		}
		assignNewCall();
	}

	public void escalateAndReassign()
	{
		if(currentCall != null)
		{
			currentCall.incrementRank();
			CallHandler.getInstance().dispatchCall(currentCall);

			currentCall = null;
		}

		assignNewCall();
	}

	public boolean assignNewCall()
	{
		if(!isFree())
			return false;

		return CallHandler.getInstance().assignCall(this);
	}

	public boolean isFree()
	{
		return currentCall == null;
	}

	public Rank getRank()
	{
		return rank;
	}
}

class Respondent extends Employee
{
	public Respondent()
	{
		rank = Rank.Responder;
	}
}

class Manager extends Employee
{
	public Manager()
	{
		rank = Rank.Manager;
	}
}

class Director extends Employee
{
	public Director()
	{
		rank = Rank.Director;
	}
}

class Caller 
{
	private String name;
	private int userID;
	public Caller(int ID, String name)
	{
		this.name = name;
		this.userID = ID;
	}
}

class Call
{
	private Rank rank;
	private Caller caller;
	private Employee handler;

	public Call(Caller caller)
	{
		this.rank = Rank.Responder;
		this.caller = caller;
	}

	public void setHanlder(Employee employee)
	{
		handler = employee;
	}

	public void reply(String message)
	{
		System.out.println(message);
	}

	public Rank getRank()
	{
		return rank;
	}

	public void setRank(Rank rank)
	{
		this.rank = rank;
	}

	public Rank incrementRank()
	{
		if(rank == Rank.Responder)
			rank = Rank.Manager;
		else if (rank == Rank.Manager)
			rank = Rank.Director;

		return rank;
	}

	public void disconnect()
	{
		reply("Thank you for calling");
	}
}


class CallHandler
{
	private static CallHandler instance;

	private final int LEVELS = 3;

	private final int NUM_RESPONDENTS = 10;
	private final int NUM_MANAGERS = 4;
	private final int NUM_DIRECTORS = 2;

	List<List<Employee>> employeeLevels;

	List<List<Call>> callQueues;

	protected CallHandler()
	{
		employeeLevels = new ArrayList<List<Employee>>(LEVELS);
		callQueues = new ArrayList<List<Call>>();


		ArrayList<Employee> respondents = new ArrayList<Employee>(NUM_RESPONDENTS);

		for(int k = 0; k < NUM_RESPONDENTS; k++)
			respondents.add(new Respondent());

		employeeLevels.add(respondents);
		
		ArrayList<Employee> managers = new ArrayList<Employee>(NUM_MANAGERS);

		for(int k = 0; k < NUM_MANAGERS; k++)
			managers.add(new Manager());

		employeeLevels.add(managers);

		ArrayList<Employee> directors = new ArrayList<Employee>(NUM_DIRECTORS);

		for(int k = 0; k < NUM_MANAGERS; k++)
			directors.add(new Director());

		employeeLevels.add(directors);

	}

	public static CallHandler getInstance()
	{
		if(instance == null)
			instance = new CallHandler();

		return instance;
	}
	
	public Employee getHandlerForCall(Call call)
	{
		for (int level = call.getRank().getValue(); level < LEVELS - 1; level++)
		{
			List<Employee> employeeLevel = employeeLevels.get(level);
			for(Employee employee : employeeLevel)
			{
				if(employee.isFree())
					return employee;
			}
		}
		return null;
	}

	public void dispatchCall(Caller caller)
	{
		Call call = new Call(caller);
		dispatchCall(call);
	}

	public void dispatchCall(Call call)
	{
		Employee employee = getHandlerForCall(call);
		if(employee != null)
		{
			employee.receiveCall(call);
			call.setHanlder(employee);
		}
		else
		{
			call.reply("Please wait for free employee to reply");
	        callQueues.get(call.getRank().getValue()).add(call);
		}
	}

	public boolean assignCall(Employee employee)
	{
		for (int rank = employee.getRank().getValue(); rank >= 0; rank--) 
		{
            List<Call> que = callQueues.get(rank);
            
            if (que.size() > 0) 
            {
	            Call call = que.remove(0); 
	            if (call != null) 
	            {
	                employee.receiveCall(call);
	                return true;
	            }
            }
        }
        return false;
    }
}

public class OODCallCenter
{
	public static void main(String[] args)
	{
		CallHandler ch = CallHandler.getInstance();
	}
}










