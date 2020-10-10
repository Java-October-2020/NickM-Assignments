import java.util.HashMap;
import java.util.Set;

public class HashMaptique{
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Oh, Sally why?", "why did you kill me Sally why Sally why");
        trackList.put("Run", "I be running and running and running and running");
        trackList.put("Hello", "hello, is it me you're looking for");
        trackList.put("Little Bitch", "This song isnt about me it's about you, you little bitch");
        trackList.put("Run it back", "That's right I made two songs about you, you little bitch");
        
        // // String song2 = trackList.get("Run");
        // System.out.println(song2);

        for (String name: trackList.keySet()){
            String key = name.toString();
            String value = trackList.get(name).toString();  
            System.out.println("Song: " + key + " Lyric: " + value);   
        }
    }
}