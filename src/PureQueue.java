import java.util.ArrayDeque;
import java.util.ArrayList;

public class PureQueue<E> {
	private ArrayList<E> data;

	PureQueue() {
		data = new ArrayList<>();
	}

	void enqueue(E o) {
		data.add(o);
	}

	E dequeue() {
		E aux = data.get(0);
		data.remove(aux);
		return aux;
	}

	E item(int i) {
		return data.get(i);
	}

	E removeItem(E o) {
		if (data.contains(o)) {
			int i = data.indexOf(o);
			E aux = data.get(i);
			data.remove(aux);
			return aux;
		}
		return null;
	}

	E peek() {
		return data.get(data.size() - 1);
	}

	int size() {
		return data.size();
	}

	public String toString() {
		return data.toString();
	}

	public boolean isEmpty() {
		return data.isEmpty();
	}

}