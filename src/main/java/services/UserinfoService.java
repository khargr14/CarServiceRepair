package services;

import dao.imple.CarDao;

public class UserinfoService implements ICarUserDetails{
    CarDao dao1 = new CarDao();
    public void addNewUser(String name, int id,int age_user)
    {
 int uid=id;
 String uname=name;
 int uage=age_user;
dao1.Insert_User_Details(uid,uname,uage);
dao1.getAlldat();
}



    public void delete(int id){

     int did=id;
     dao1.delete(did);

    }
}
