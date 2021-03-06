package models;

import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.Id;
import java.util.HashSet;

/**
 * Created by Supriya on 14/10/2014.
 */
public class Question {
    @Id
    @Constraints.Required
    @Formats.NonEmpty
    public Long questionNumber;

    @Constraints.Required
    @Formats.NonEmpty
    public Long eventId;

    @Constraints.Required
    @Formats.NonEmpty
    public String Question = "The functional dependencies are A->B,B->C,C->EA, B->DF. Closure of A is:";

    @Constraints.Required
    @Formats.NonEmpty
    public String Option1 = "A+ = {A,B,C}";

    @Constraints.Required
    @Formats.NonEmpty
    public String Option2 = "A+ = {A,B}";

    @Constraints.Required
    @Formats.NonEmpty
    public String Option3 = "A+ = {A,B,C,D,E,F}";

    @Constraints.Required
    @Formats.NonEmpty
    public String Option4 = "A+ = {A,B,C}";

    @Constraints.Required
    @Formats.NonEmpty
    public String Answer = Option3;

    public static Question getQuestionByEventId(){
        Question q = new Question();
        return q;
    }
}
