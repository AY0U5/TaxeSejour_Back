package ma.zs.sejour.ws.converter.commun;

import ma.zs.sejour.bean.core.Taxe.TaxeSejourTrim;
import ma.zs.sejour.bean.core.commun.Locale;
import ma.zs.sejour.bean.core.commun.Quartier;
import ma.zs.sejour.bean.core.commun.Redevable;
import ma.zs.sejour.ws.dto.Taxe.TaxeSejourTrimDto;
import ma.zs.sejour.ws.dto.commun.LocaleDto;
import ma.zs.sejour.ws.dto.commun.QuartierDto;
import ma.zs.sejour.ws.dto.commun.RedevableDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import ma.zs.sejour.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RedevableConverter extends AbstractConverter<Redevable, RedevableDto> {

    @Autowired
    private TypeRedevableConverter typeRedevableConverter;

    private boolean typeRedevable;


    public  RedevableConverter() {
        super(Redevable.class, RedevableDto.class);
        init(true);
    }
    public Redevable toItem (RedevableDto redevableDto){
        if (redevableDto == null) {
            return null;
        }else{
            Redevable bean = new Redevable();
            if(StringUtil.isNotEmpty(redevableDto.getId()))
                bean.setId(redevableDto.getId());
            if (StringUtil.isNotEmpty(redevableDto.getCode()))
                bean.setCode(redevableDto.getCode());
            if(StringUtil.isNotEmpty(redevableDto.getCin()))
                bean.setCin(redevableDto.getCin());
            if(StringUtil.isNotEmpty(redevableDto.getNom()))
                bean.setNom(redevableDto.getNom());
            if(this.typeRedevable && redevableDto.getTypeRedevableDto() != null && redevableDto.getTypeRedevableDto().getId() != null)
                bean.setTypeRedevable(typeRedevableConverter.toItem(redevableDto.getTypeRedevableDto()));
            return bean;

        }
    }

    public RedevableDto toDto (Redevable bean){
        if (bean == null) {
            return null;
        }
        RedevableDto dto = new RedevableDto();
        if(StringUtil.isNotEmpty(bean.getId()))
            dto.setId(bean.getId());
        if(StringUtil.isNotEmpty(bean.getCode()))
            dto.setCode(bean.getCode());
        if(StringUtil.isNotEmpty(bean.getCin()))
            dto.setCin(bean.getCin());
        if(StringUtil.isNotEmpty(bean.getNom()))
            dto.setNom(bean.getNom());
        if(this.typeRedevable && bean.getTypeRedevable() != null && bean.getTypeRedevable().getId() != null)
            dto.setTypeRedevableDto(typeRedevableConverter.toDto(bean.getTypeRedevable()));
        return dto;
    }
    public void initObject(boolean value) {
        this.typeRedevable = value;
    }


    public void copy(RedevableDto dto, Redevable t) {
        super.copy(dto, t);
        if (dto.getTypeRedevableDto() != null)
            typeRedevableConverter.copy(dto.getTypeRedevableDto(), t.getTypeRedevable());
    }

    public TypeRedevableConverter getTypeRedevableConverter() {
        return typeRedevableConverter;
    }

    public void setTypeRedevableConverter(TypeRedevableConverter typeRedevableConverter) {
        this.typeRedevableConverter = typeRedevableConverter;
    }

    public boolean isTypeRedevable() {
        return typeRedevable;
    }

    public void setTypeRedevable(boolean typeRedevable) {
        this.typeRedevable = typeRedevable;
    }
}
