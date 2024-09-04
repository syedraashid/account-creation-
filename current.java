public class current extends account {
    private double bal;
    private String branch;

    private current(){}

    private current(long acc_no, String acc_holder_name, String email, long contact_no,double bal,String branch) {
        super(acc_no, acc_holder_name, email, contact_no);
        this.bal=bal;
        this.branch=branch;
    }
    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    public  static current getcurrobject(long nacc_no, String nacc_holder_name, String nemail, long ncontact_no, double nbal,String nbranch) {
        return new current(nacc_no,nacc_holder_name,nemail,ncontact_no,nbal,nbranch);
    }
    public void display_the_details(){
        System.out.println("account number: "+getAcc_no());
        System.out.println("account holder name: "+getAcc_holder_name());
        System.out.println("email: "+getEmail());
        System.out.println("contact no: "+getContact_no());
        System.out.println("balance: "+getBal());
        System.out.println("branch: "+getBranch());
        System.out.println("*********************************************");

    }
}

