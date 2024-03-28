package ma.zs.sejour.ws.converter.commun;

import ma.zs.sejour.bean.core.commun.Secteur;
import ma.zs.sejour.bean.core.commun.TypeRedevable;
import ma.zs.sejour.ws.dto.commun.SecteurDto;
import ma.zs.sejour.ws.dto.commun.TypeRedevableDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import org.springframework.stereotype.Component;

@Component
public class TypeRedevableConverter extends AbstractConverter<TypeRedevable, TypeRedevableDto> {


    public  TypeRedevableConverter() {
        super(TypeRedevable.class, TypeRedevableDto.class);
        init(true);
    }

    @Override
    public TypeRedevable toItem (TypeRedevableDto typeRedevableDto){
        TypeRedevable bean = new TypeRedevable();
        bean.setId(typeRedevableDto.getId());
        bean.setCode(typeRedevableDto.getCode());
        bean.setLibelle(typeRedevableDto.getLibelle());
        return bean;
    }

    @Override
    public TypeRedevableDto toDto (TypeRedevable bean){
        TypeRedevableDto dto = new TypeRedevableDto();
        dto.setId(bean.getId());
        dto.setCode(bean.getCode());
        dto.setLibelle(bean.getLibelle());
        return dto;
    }

    public void initObject(boolean value) {
    }

}
