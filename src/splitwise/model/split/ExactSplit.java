package splitwise.model.split;

import splitwise.model.User;

public class ExactSplit extends Split{

    public ExactSplit(User user , double amount) {
        super(user);
        this.amount= amount;
    }
}
