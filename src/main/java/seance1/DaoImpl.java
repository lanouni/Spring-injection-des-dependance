package seance1;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
 @Override
public double getData() {
	System.out.println("version base de donnnes");
	double temp = Math.random()*50;
	return temp;
}
}
