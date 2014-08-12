class ArrayList {
	private final int Maxsize=10;
	private int size;
	private int max_size;
	private int [] arreglo;
	
	public ArrayList(){
		this.size=0;
		this.max_size=10;
		this.arreglo=new int[this.max_size];
		}
	public ArrayList(int max){
		this.size=0;
		this.max_size=max;
		this.arreglo=new int[this.max_size];
		}
	public void add(int e){
		if(this.size<this.max_size){
			this.arreglo[this.size]=e;
			this.size++;
			}
			else{
				//throw new Exception ("Hola");
				}
		}
	public int getSize(){
		return this.size;
		}
	public int getMax_size(){
		return this.max_size;
		}
	public int getElemento(int indice){
		if (indice>=this.size){
			return -1;
			}
		else{
			return arreglo[indice];
			}
		}
	public int find(int e){
		if(this.size<=this.max_size){
			for(int i=0;i<this.size;i++){
				if(e==arreglo[i]){
					return i;
					}
				}	
			}
			return -1;
		}
		
	public void delete(int e){
		int i=this.find(e);
			size--;
			do {
				
				
				
				arreglo[i]=arreglo[i+1];
				i++;
		
				
				}while(i<size);	
				//size--;
		}
	public void insert(int e, int indice){
		int acumulador;
		if(indice<size&&this.size<this.max_size){
			acumulador=arreglo[indice];
			arreglo[indice]=e;
			while(indice<=size){
				indice++;
				e=acumulador;
				acumulador=arreglo[indice];
				arreglo[indice]=e;
			}
			arreglo[indice]=e;
			size++;
			//arreglo[indice]=e;
			}


		else{
			System.out.println("no se puede insertar");
			}
		}
		}
		
	
