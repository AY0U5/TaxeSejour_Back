package ma.zs.sejour.ws.converter.commun;

import ma.zs.sejour.bean.core.commun.CategorieSejour;
import ma.zs.sejour.bean.core.commun.Employe;
import ma.zs.sejour.ws.dto.commun.CategorieSejourDto;
import ma.zs.sejour.ws.dto.commun.EmployeDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import ma.zs.sejour.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class EmployeConverter extends AbstractConverter<Employe, EmployeDto> {


    public  EmployeConverter() {
        super(Employe.class, EmployeDto.class);
        init(true);
    }

    @Override
    public Employe toItem (EmployeDto dto){
        if (dto == null) {
            return null;
        }else{
            Employe bean = new Employe();
            if(StringUtil.isNotEmpty(dto.getId()))
                bean.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                bean.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getPaswrd()))
                bean.setPaswrd(dto.getPaswrd());
            if(StringUtil.isNotEmpty(dto.getUsername()))
                bean.setUsername(dto.getUsername());
            return bean;
        }
    }

    @Override
    public EmployeDto toDto (Employe bean){
        if (bean == null) {
            return null;
        }else{
            EmployeDto dto = new EmployeDto();
            if(StringUtil.isNotEmpty(bean.getId()))
                dto.setId(bean.getId());
            if(StringUtil.isNotEmpty(bean.getCode()))
                dto.setUsername(bean.getUsername());
            if(StringUtil.isNotEmpty(bean.getPaswrd()))
                dto.setPaswrd(bean.getPaswrd());
            if(StringUtil.isNotEmpty(bean.getUsername()))
                dto.setCode(bean.getCode());
            return dto;
        }
    }
}
