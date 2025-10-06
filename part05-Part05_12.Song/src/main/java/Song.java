
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    @Override
    public boolean equals(Object compared){
        // Check if variables are located in same position
        if (this == compared) {
            return true;
        }
        
        // Check if compared object is of type Song
        if(!(compared instanceof Song)){
            return false;
        }
        
        // Convert object to Song object
        Song comparedSong = (Song) compared;
        
        // Compare value of object variables. If they are all the same, the objects are equal
        if (this.artist.equals(comparedSong.artist) 
                && this.name.equals(comparedSong.name)
                && this.durationInSeconds == comparedSong.durationInSeconds) {
            return  true;
        }
        
        // Otherwise, objects are not equal
        return false;
    }
}
