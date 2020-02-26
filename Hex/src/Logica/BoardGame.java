package Logica;

import java.util.Vector;

public class BoardGame extends Vector<Hexagon> {
	
	public static int dim=11;
	
	public void CreateBoardGame()
	{
		for(int i=1; i<=(dim*dim); i++)
		{
			/*String id=new String();
			String l1=new String();
			String l2=new String();
			String l3=new String();
			String l4=new String();
			String l5=new String();
			String l6=new String();*/
		
			int l1=0;
			int l2=0;
			int l3=0;
			int l4=0;
			int l5=0;
			int l6=0;
			
			//CELLA NORD-OVEST
			if(i==1)
			{
				/*l1=l2=l6="0";
				l3=l3.valueOf(i+1);
				l4=l4.valueOf(i+dim+1);
				l5=l5.valueOf(i+dim);*/
				l1=l2=l6=0;
				l3=(i+1);
				l4=(i+dim+1);
				l5=(i+dim);
			}
			//CELLA NORD-EST
			else if(i==dim)
			{
				/*l1=l2=l3=l4="0";
				l5=l5.valueOf(dim*2);
				l6=l6.valueOf(i-1);*/
				l1=l2=l3=l4=0;
				l5=(dim*2);
				l6=(i-1);
			}
			//CELLA SUD-OVEST
			else if(i==((dim*dim)-dim+1))
			{
				/*l1=l4=l5=l6="0";
				l2=l2.valueOf(i-dim);
				l3=l3.valueOf(i+1);*/
				l1=l4=l5=l6=0;
				l2=(i-dim);
				l3=(i+1);
			}
			//CELLA SUD-EST
			else if(i==(dim*dim))
			{
				/*l3=l4=l5="0";
				l1=l1.valueOf((i-dim)-1);
				l2=l2.valueOf(i-dim);
				l6=l6.valueOf(i-1);*/
				l3=l4=l5=0;
				l1=((i-dim)-1);
				l2=(i-dim);
				l6=(i-1);
			}
			//BORDO OVEST
			else if(i%dim==1)
			{
				/*l1=l6="0";
				l2=l2.valueOf(i-dim);
				l3=l3.valueOf(i+1);
				l4=l4.valueOf(i+dim+1);
				l5=l5.valueOf(i+dim);*/
				l1=l6=0;
				l2=(i-dim);
				l3=(i+1);
				l4=(i+dim+1);
				l5=(i+dim);
			}
			//BORDO EST
			else if(i%dim==0)
			{
				/*l3=l4="0";
				l1=l1.valueOf((i-dim)-1);
				l2=l2.valueOf(i-dim);
				l5=l5.valueOf(i+dim);
				l6=l6.valueOf(i-1);*/
				l3=l4=0;
				l1=((i-dim)-1);
				l2=(i-dim);
				l5=(i+dim);
				l6=(i-1);
			}
			//BORDO NORD
			else if(i>1 && i<dim)
			{
				/*l1=l2="0";
				l3=l3.valueOf(i+1);
				l4=l4.valueOf(i+dim+1);
				l5=l5.valueOf(i+dim);
				l6=l6.valueOf(i-1);*/
				l1=l2=0;
				l3=(i+1);
				l4=(i+dim+1);
				l5=(i+dim);
				l6=(i-1);
			}
			//BORDO SUD
			else if(i>((dim*dim)-dim+1) && i<(dim*dim))
			{
				/*l4=l5="0";
				l1=l1.valueOf((i-dim)-1);
				l2=l2.valueOf(i-dim);
				l3=l3.valueOf(i+1);
				l6=l6.valueOf(i-1);*/
				l4=l5=0;
				l1=((i-dim)-1);
				l2=(i-dim);
				l3=(i+1);
				l6=(i-1);
			}
			else
			{
				/*l1=l1.valueOf((i-dim)-1);
				l2=l2.valueOf(i-dim);
				l3=l3.valueOf(i+1);
				l4=l4.valueOf(i+dim+1);
				l5=l4.valueOf(i+dim);
				l6=l6.valueOf(i-1);*/
				l1=((i-dim)-1);
				l2=(i-dim);
				l3=(i+1);
				l4=(i+dim+1);
				l5=(i+dim);
				l6=(i-1);
			}
			
			add(new Hexagon(i,l1,l2,l3,l4,l5,l6));
		}		
	}
	
	public void Stampa()
	{
		for(int i=0; i<size(); i++)
			System.out.println(get(i).toString());
	}
}
