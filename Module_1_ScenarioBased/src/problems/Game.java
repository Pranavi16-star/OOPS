package problems;
class Player {
    private String name;

    public Player(String name) {
        this.name = name;
        System.out.println("Player " + name + " created.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("💀 Player " + name + " is being garbage collected.");
    }
}

class Game {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Player p = new Player("P" + i);
            // p reference is lost at end of loop iteration → eligible for GC
        }

        System.out.println("Requesting Garbage Collection...");
        System.gc();  // Suggests JVM to run GC (not guaranteed immediately)

        // Pause to give JVM time
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
    }
}
