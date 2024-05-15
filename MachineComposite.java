public class MachineComposite extends MachineComponent {
    private List<MachineComponent> components = new ArrayList<>();

    public void add(MachineComponent component) {
        components.add(component);
    }

    @Override
    public int getMachineCount() {
        int totalMachines = 0;
        for (MachineComponent component : components) {
            totalMachines += component.getMachineCount();
        }
        return totalMachines;
    }
public static void main(String[] args) {
        // Exemplo de uso
        MachineComposite composite = new MachineComposite();
        composite.add(new Machine()); // Adiciona uma máquina
        composite.add(new Machine()); // Adiciona outra máquina

        System.out.println("Total de máquinas no componente composto: " + composite.getMachineCount());
    }
//O objetivo dessa classe é representar um componente composto por várias máquinas.