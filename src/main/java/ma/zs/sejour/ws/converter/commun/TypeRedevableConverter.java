package ma.zs.sejour.ws.converter.commun;

import ma.zs.sejour.bean.core.commun.Secteur;
import ma.zs.sejour.bean.core.commun.TypeRedevable;
import ma.zs.sejour.ws.dto.commun.SecteurDto;
import ma.zs.sejour.ws.dto.commun.TypeRedevableDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import ma.zs.sejour.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class TypeRedevableConverter extends AbstractConverter<TypeRedevable, TypeRedevableDto> {


    public  TypeRedevableConverter() {
        super(TypeRedevable.class, TypeRedevableDto.class);
        init(true);
    }

    @Override
    public TypeRedevable toItem (TypeRedevableDto typeRedevableDto){
        if (typeRedevableDto == null) {
            return null;
        }
        TypeRedevable bean = new TypeRedevable();
        if(StringUtil.isNotEmpty(typeRedevableDto.getId()))
            bean.setId(typeRedevableDto.getId());
        if(StringUtil.isNotEmpty(typeRedevableDto.getCode()))
            bean.setCode(typeRedevableDto.getCode());
        if(StringUtil.isNotEmpty(typeRedevableDto.getLibelle()))
            bean.setLibelle(typeRedevableDto.getLibelle());
        return bean;
    }

    @Override
    public TypeRedevableDto toDto (TypeRedevable bean){
        if (bean == null) {
            return null;
        }else{
            TypeRedevableDto dto = new TypeRedevableDto();
            if(StringUtil.isNotEmpty(bean.getId()))
                dto.setId(bean.getId());
            if(StringUtil.isNotEmpty(bean.getCode()))
                dto.setCode(bean.getCode());
            if(StringUtil.isNotEmpty(bean.getLibelle()))
                dto.setLibelle(bean.getLibelle());
            return dto;
        }

    }


}
