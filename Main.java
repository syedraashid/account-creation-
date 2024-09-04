//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        savings s1 = savings.getsavobject(123456789, "syed", "syed@email.com", 1345382323, 1500, "kanchipuram");
        savings s2 = savings.getsavobject(123456799, "logi", "logi@email.com", 1345382321, 2200, "kanchipuram");
        savings s3= savings.getsavobject(123456778,"ponmudi","pon@email.com",1345382322,2225,"salem");
        savings s4=savings.getsavobject(123456773,"balaji","bal@email.com",1345382325,22455,"walajabad");
        savings [] sav={s1,s2,s3,s4};
        current c1=current.getcurrobject(1896584510,"mubarak","mubu@mail.com",1888654688,200,"krishnagiri");
        current c2=current.getcurrobject(1896584460,"sakthi","sakthi@mail.com",1888654678,20550,"namakal");
        current c3=current.getcurrobject(1896584522,"afridi","afridi@mail.com",1888654677,15000,"kanchipuram");
        current[] cur={c1,c2,c3};
        boolean flag=true;
        do {
            System.out.println("\t\t\tselect your option");
            System.out.println("1.savings account\n2.currrent account\n3.exit");
            int sel_option=sc.nextInt();
            switch (sel_option){
                case 1:{//saving acc
                    boolean sav_loop=true;
                    do {//sav option
                        System.out.println("\t\t\tselect your option");
                        System.out.println("1.acc_balance >2000\n2.acc_balance<2000\n3.all acc\n4.exit");
                        int sav_option=sc.nextInt();
                        switch (sav_option){
                            case 1:{//sav bal>2000
                                acc_sort(sav,1);
                                break;}
                            case 2:{//sav bal<2000
                                acc_sort(sav,2);
                                break;}
                            case 3:{//sav all_acc
                                for (savings user:sav){
                                    user.display_the_details();
                                }
                                break;}
                            case 4:{//sav exit
                                System.out.println("**********exiting*********");
                                sav_loop=false;
                                break;}
                            default:{
                                System.out.println("selected the wrong option");
                                break;}
                        }

                    }while (sav_loop);
                    break;}
                case 2:{//curr acc
                    boolean curr_loop=true;
                    do {//sav option
                        System.out.println("\t\t\tselect your option");
                        System.out.println("1.acc_balance >2000\n2.acc_balance<2000\n3.all acc\n4.exit");
                        int curr_option=sc.nextInt();
                        switch (curr_option){
                            case 1:{//curr bal>2000
                                curr_sort(cur,1);
                                break;}
                            case 2:{//curr bal<2000
                                curr_sort(cur,2);
                                break;}
                            case 3:{//curr all_acc
                                for (current user:cur){
                                    user.display_the_details();
                                }
                                break;}
                            case 4:{//curr exit
                                System.out.println("**********exiting*********");
                                break;}
                            default:{
                                System.out.println("selected the wrong option");
                                break;}
                        }
                    }while (curr_loop);
                    break;}
                case 3:{//option exit
                    System.out.println("*************exiting*********");
                    flag=false;
                    break;}
                default:{//option default
                    System.out.println("wrong input");
                    break;
                }
            }

        }while (flag);
    }
    public static void acc_sort(savings[] sav,int opt){
        for (savings user:sav){
            if (opt==1 && user.getBal()>2000){
                user.display_the_details();
            }
            else if (opt==2 && user.getBal()<2000){
                user.display_the_details();
            }
        }
    }
    public static void curr_sort(current[] sav,int opt){
        for (current user:sav){
            if (opt==1 && user.getBal()>2000){
                user.display_the_details();
            }
            else if (opt==2 && user.getBal()<2000){
                user.display_the_details();
            }
        }
    }

}