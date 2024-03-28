package ma.zs.sejour.ws.converter.commun;

import ma.zs.sejour.bean.core.commun.CategorieSejour;
import ma.zs.sejour.bean.core.commun.Employe;
import ma.zs.sejour.ws.dto.commun.CategorieSejourDto;
import ma.zs.sejour.ws.dto.commun.EmployeDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import org.springframework.stereotype.Component;

@Component
public class EmployeConverter extends AbstractConverter<Employe, EmployeDto> {


    public  EmployeConverter() {
        super(Employe.class, EmployeDto.class);
        init(true);
    }

    @Override
    public Employe toItem (EmployeDto dto){
        Employe bean = new Employe();
        bean.setId(dto.getId());
        bean.setCode(dto.getCode());
        bean.setPaswrd(dto.getPaswrd());
        bean.setUsername(dto.getUsername());
        return bean;
    }

    @Override
    public EmployeDto toDto (Employe bean){
        EmployeDto dto = new EmployeDto();
        dto.setId(bean.getId());
        dto.setUsername(bean.getUsername());
        dto.setPaswrd(bean.getPaswrd());
        dto.setCode(bean.getCode());
        return dto;
    }

    public void initObject(boolean value) {
    }


}
