public class Comments {

    private int id;
    private Customer customer;
    private String question;
    private String answer;
    

    public Comments(int id, Customer customer, String question, String answer) {
        this.id = id;
        this.customer = customer;
        this.question = question;
        this.answer = answer;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }



    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }


    public Customer getCustomer() {
        return customer;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
}
