import java.util.ArrayDeque;
import java.util.Deque;

interface DIStack<E>
{
	public boolean push(E item);
	public E pop();
}
class DCStack<E> implements DIStack<E>
{
	private Deque<E> deq;
	
	public DCStack(Deque<E> d) {deq = d;}
	public boolean push (E item){return deq.offerFirst(item);}
	public E pop() {return deq.pollFirst();}
}

public class D3_DefinedStack
{
	public static void main(String[] args)
	{
		DIStack<String> stk = new DCStack<>(new ArrayDeque<String>());
		
		//PUSH 연산
		stk.push("1.Box");
		stk.push("2.Toy");
		stk.push("3.RObot");
		//POP 연산
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
	}
}
