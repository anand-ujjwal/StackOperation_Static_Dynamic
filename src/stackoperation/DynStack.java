package stackoperation;

public class DynStack implements IntStack {
	private int stck[];
	private int tos;
	// allocate and initialize stack
	DynStack(int size) {
	stck = new int[size];
	tos = -1;
	}
	@Override
	public void push(int item) {
		// TODO Auto-generated method stub
		// if stack is full, allocate a larger stack
		if(tos==stck.length-1) {
		int temp[] = new int[stck.length * 2]; // double size
		for(int i=0; i<stck.length; i++) temp[i] = stck[i];
		stck = temp;
		stck[++tos] = item;
		}
		else
		stck[++tos] = item;
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(tos < 0) {
			System.out.println("Stack underflow.");
			return 0;
			}
			else
			return stck[tos--];

	}

}
