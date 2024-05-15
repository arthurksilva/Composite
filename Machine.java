public abstract class Machine extends MachineComponent {
    private String name;

    public Machine(String name) {
        this.name = name;
    }

    @Override
    public int getMachineCount() {
        return 1; // Uma máquina individual
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        Machine individualMachine = new ConcreteMachine("Máquina A");
        System.out.println("Nome da máquina: " + individualMachine.getName());
        System.out.println("Total de máquinas: " + individualMachine.getMachineCount());
    }
}

// Classe concreta que herda de Machine
class ConcreteMachine extends Machine {
    public ConcreteMachine(String name) {
        super(name);
    }
}
//Essa classe representa uma máquina individual. 