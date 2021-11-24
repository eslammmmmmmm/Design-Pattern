
package dessign.pattren;


public class staff_Factory {
    public Staff getStaff(String NameJop)
    {
        String NJop=NameJop.toLowerCase();
       /* if(NJop==null)
            return null;
        else if(NJop=="doctor")
            return new Doctor();
         else if(NJop=="teaching assistant"||NJop=="Teaching Assistant")
            return new TeachingAssistant();
        return null;*/
        switch(NJop)
        {
           case "doctor":
                 return new Doctor();
            case "teaching assistant":
                 return new TeachingAssistant();
            default:
                return null;
        }

    }
    
}
