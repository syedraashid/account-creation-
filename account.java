public class account {
       private long acc_no;
        private String acc_holder_name;
        private String email;
        private long contact_no;
         account(){}

     account(long acc_no,String acc_holder_name,String email,long contact_no){
            this.acc_no=acc_no;
            this.acc_holder_name=acc_holder_name;
            this.email=email;
            this.contact_no=contact_no;
        }

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getAcc_holder_name() {
        return acc_holder_name;
    }

    public void setAcc_holder_name(String acc_holder_name) {
        this.acc_holder_name = acc_holder_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact_no() {
        return contact_no;
    }

    public void setContact_no(long contact_no) {
        this.contact_no = contact_no;
    }
//    public static account getaccobject(long uacc_no,String uacc_holder_name,String uemail,long ucontact_no){
//            return new account(uacc_no,uacc_holder_name,uemail,ucontact_no);
//    }
}
