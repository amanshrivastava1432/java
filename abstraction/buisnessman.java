package abstraction;

public class buisnessman implements richman, socialworker {



@Override
public void earnmoney() {
	System.out.println("earn money");
	
}

@Override
public void party() {
	// TODO Auto-generated method stub
	System.out.println("doing party");
}

@Override
public void donation() {
	// TODO Auto-generated method stub
	System.out.println("hepl to others");
}

@Override
public void socialworker() {
	// TODO Auto-generated method stub
	System.out.println("hepls to other");
}
}