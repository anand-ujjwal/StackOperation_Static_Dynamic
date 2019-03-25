package stackoperation;

public class FixedStack implements IntStack {
	private int stck[];
	private int tos;
	// allocate and initialize stack
	FixedStack(int size) {
	stck = new int[size];
	tos = -1;
	}
	@Override
	public void push(int item) {
		// TODO Auto-generated method stub
		if(tos==stck.length-1) // use length member
			System.out.println("Stack is full.");
			else
			stck[++tos] = item;
	}

	@Override
	public int pop() {
		if(tos < 0) {
			System.out.println("Stack underflow.");
			return 0;
			}
			else
			return stck[tos--];
				// TODO Auto-generated method stub
	}

}
