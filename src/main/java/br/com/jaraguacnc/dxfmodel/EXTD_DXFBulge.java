package br.com.jaraguacnc.dxfmodel;

import br.com.jaraguacnc.utils.Consts;

public class EXTD_DXFBulge extends DXFLine{

	double bulge;
		
	public EXTD_DXFBulge(){
		setType(Consts.EXTD_DXF_BULGE);
	}

	public double getBulge() {
		return bulge;
	}

	public void setBulge(double bulge) {
		this.bulge = bulge;
	}
	
	public double calculateBulge(double radius){
		
		double bulge = 0,
			   x1 = startPointX,
			   y1 = startPointY,
			   x2 = endPointX,
			   y2 = endPointY,
			   r = radius,
			   d,
			   a,
			   b,
			   l;
		
		d = sqrt(pow(abs(x1-x2), 2) + pow(abs(y1-y2), 2));
		a = d/(double) 2;
		b = sqrt(pow(r,2) - pow(a,2));
		l = r - b;
		bulge = (-1) * l/(double)a;
		
		return bulge;
		
	}
	
	public double sqrt(double x){
		return Math.sqrt(x);
	}
	
	public double abs(double x){
		return Math.abs(x);
	}
	
	public double pow(double x1,double x2){
		return Math.pow(x1,x2);
	}
	
	
	
}
