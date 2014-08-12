public class test{
	
	public static void main (String[] args){
		ArrayList c = new ArrayList();
		//System.out.println("El area del circulo es: "+c.calcularArea());
		for (int i=0;i<7;i++){
			System.out.println(i);
			c.add(i);
			}
		System.out.println(c.getSize());
		c.insert(666,5);
		System.out.println(c.find(666));
		System.out.println(c.find(6));
		System.out.println(c.getSize());
		System.out.println(c.getElemento(3));
		System.out.println(c.getMax_size());
		System.out.println(c.find(2));
		c.insert(65,2);
		System.out.println(c.find(2));

		}
	
	
	}

