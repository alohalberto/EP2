package uoc.ded.practica.tad;
import java.util.Comparator;
import uoc.ei.tads.ContenedorAcotado;
import uoc.ei.tads.Iterador;
import uoc.ei.tads.IteradorVectorImpl;
/**
 * TAD que implementa un vector ordenado. La ordenación del vector se determina
 * con el comparador
 */
public class VectorOrdenado<E> implements ContenedorAcotado<E>{
	private Comparator<E> comparator;
	private E[] data;
	private int len;
	public VectorOrdenado(int max, Comparator<E> comparator) {
		this.comparator = comparator;
		this.data= (E[])new Object[max];
		this.len=0;
	}
	public E elementAt(int i) {
		return this.data[i];
	}
	/**
	 * método que indica si un elementos es igual que el segundo
	 * @param elem1
	 * @param elem2
	 * @return
	 */
	private boolean compare(E elem1, E elem2) {
		boolean res = ((Comparable<E>)elem1).compareTo(elem2)==0;
		return res;
	}
	public void rshift(int i) {
		// desplazamiento (right) de todos los elemtnos una posición
		int p=this.len-1;
		while (p>=i) {
			this.data[p+1]=this.data[p];
			p--;
		}
	}
	public void lshift(int i) {
		// desplazamineto (left) de todos los elementos una posición
		int p=i;
		while (p<this.len) {
			this.data[p]=this.data[p+1];
			p++;
		}
	}
	public void update(E vIn) {
		int i = 0;
		boolean end=false;
		E v = null;
		// Si existe el elemento se borra y se vuelve a añadir
		this.delete(vIn);
		if (this.estaLleno()) {
			E pOut = this.last();
			if (comparator.compare(pOut, vIn)>0) {
				this.delete(pOut);
				this.update(vIn);
			}
		}
		// se realiza un recorrido para determinar la posición a añadir
		while (i<this.len && this.data[i]!=null && this.comparator.compare(this.data[i], vIn)>=0) 
			i++;
		// desplazamiento hacia la derecha de todos los elementos
		rshift(i);
		// se añade el elemento en la posición 
		this.data[i]=vIn;
		this.len++;
	}
	public void delete (E elem) {
		int i=0;
		boolean found=false;
		while (!found && i<this.len) 
			found= (compare(elem, this.data[i++]));		
		if (found) {
			lshift(i-1);
			this.len--;
		}
	}
	@Override
	public Iterador<E> elementos() {
		return (Iterador<E>)new IteradorVectorImpl(this.data, this.len,0);
	}
	@Override
	public boolean estaVacio() {
		return this.len==0;
	}
	@Override
	public int numElems() {
		return this.len;
	}
	@Override
	public boolean estaLleno() {
		return this.len==this.data.length;
	}
	/**
	 * métdo de prueba
	 * @param args
	 */
	public static void main(String[] args) {
		Comparator<Integer> cmp = new Comparator<Integer>() {
			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return arg0.compareTo(arg1);
			}
		};
		VectorOrdenado<Integer> v = new VectorOrdenado<Integer>(10, cmp);
		v.update(7);
		v.update(9);
		v.update(5);
		v.update(2);
		v.update(3);
		v.update(1);
		//v.afegir(4);
		v.update(6);
		System.out.println("estaLleno "+v.estaLleno());
		for (Iterador<Integer> it = v.elementos(); it.haySiguiente();) {
			System.out.println(it.siguiente());
		}
		System.out.println("delete 3");
		v.delete(3);
		for (Iterador<Integer> it = v.elementos(); it.haySiguiente();) {
			System.out.println(it.siguiente());
		}
		System.out.println("post delete 3");
		v.update(9);
		v.update(10);
		v.update(11);
		for (Iterador<Integer> it = v.elementos(); it.haySiguiente();) {
			System.out.println(it.siguiente());
		}
	}
	public E last() {
		// TODO Auto-generated method stub
		return this.data[this.len-1];
	}
}