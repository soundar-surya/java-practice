package InterfaceSegregationPrinciple.Implementations;

import InterfaceSegregationPrinciple.Templates.ProcessAccessoryRepairTemplate;

public class ProcessAccessoryRepairImpl implements ProcessAccessoryRepairTemplate{
    // @Override
    public void ProcessAccessoryRepair(String accessoryType){
        System.out.printf("%s repair accepted!\n", accessoryType);
    }
}
