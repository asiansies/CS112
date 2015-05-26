/*
Description
class StopWatch
This class provides a timer for recording elapsed time.
Interface Methods
void start()
This method starts recording elapsed time.
void stop()
This method stops recording elapsed time.
long getElapsedTime()
This method reports elapsed time.  If the timer is currently running, this method returns the elapsed time in milliseconds since the timer was started.  If the timer has been stopped, this method return the time in milliseconds which elapsed between the time the timer was started and when it was stopped.
 */

class StopWatch
{
	private long startTime = 0;
	private long stopTime = 0;
	private boolean running = false;
	public void start()
	{
		this.startTime = System.currentTimeMillis();
		this.running = true;
	}
	public void stop()
	{
		this.stopTime = System.currentTimeMillis();
		this.running = false;
	}
	// elapsed time in milliseconds
	public long getElapsedTime()
	{
		long elapsed;
		if (running)
		{
			elapsed = (System.currentTimeMillis() - startTime);
		}
		else
		{
			elapsed = (stopTime - startTime);
		}
		return elapsed;
	}
}