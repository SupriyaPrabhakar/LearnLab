package models;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Supriya on 14/10/2014.
 */
public class Event extends Model{

    @Id
    @Constraints.Required
    @Formats.NonEmpty
    public Long eventId;

    @Constraints.Required
    @Formats.NonEmpty
    public String eventName = "Databases: Normalization";

    @Constraints.Required
    @Formats.NonEmpty
    public String script = "";

    @Constraints.Required
    @Formats.NonEmpty
    public HashSet<String> hashTags;

    @Constraints.Required
    @Formats.NonEmpty
    public ArrayList<User> participants;

    @Constraints.Required
    @Formats.NonEmpty
    public List Question;

    public static Event findEvent(){
        Event e = new Event();
        HashSet<String> tags = new HashSet<String>();
        tags.add("#Concept");
        tags.add("#Justification");
        tags.add("#Examples");
        return e;
    }
}
