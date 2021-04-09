public abstract class Instrument {

        protected String name;

        public Instrument(){

                name= "Unknown...";
        }

        public void play(){

                System.out.println(name +" is playing...");
        }
}
