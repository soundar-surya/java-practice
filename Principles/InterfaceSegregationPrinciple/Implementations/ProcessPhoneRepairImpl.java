package InterfaceSegregationPrinciple.Implementations;

import InterfaceSegregationPrinciple.Templates.ProcessPhoneRepairTemplate;

public class ProcessPhoneRepairImpl implements ProcessPhoneRepairTemplate{
    // @Override
    public void ProcessPhoneRepair(String modelName){
        System.out.printf("%s repair accepted!", modelName);
    }
}
