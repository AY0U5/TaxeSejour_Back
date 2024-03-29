package ma.zs.sejour.ws.converter.commun;

import ma.zs.sejour.bean.core.Taxe.TaxeSejourTrim;
import ma.zs.sejour.bean.core.commun.Redevable;
import ma.zs.sejour.bean.core.commun.Rue;
import ma.zs.sejour.ws.dto.Taxe.TaxeSejourTrimDto;
import ma.zs.sejour.ws.dto.commun.RedevableDto;
import ma.zs.sejour.ws.dto.commun.RueDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import ma.zs.sejour.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RueConverter extends AbstractConverter<Rue, RueDto> {
    @Autowired
    private QuatierConverter quatierConverter;

    private boolean quartier;

    public  RueConverter() {
        super(Rue.class, RueDto.class);
        init(true);
    }

    @Override
    public Rue toItem(RueDto dto) {
        if (dto == null) {
            return null;
        }else{
            Rue bean = new Rue();
            if(StringUtil.isNotEmpty(dto.getId()))
                bean.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                bean.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                bean.setLibelle(dto.getLibelle());
            if(this.quartier && dto.getQuartierDto()!= null && dto.getQuartierDto().getId() != null)
                bean.setQuartier(quatierConverter.toItem(dto.getQuartierDto()));
            return bean;
        }
    }

    @Override
    public RueDto toDto(Rue bean) {
        if (bean == null) {
            return null;
        }else{
            RueDto dto = new RueDto();
            if(StringUtil.isNotEmpty(bean.getId()))
                dto.setId(bean.getId());
            if(StringUtil.isNotEmpty(bean.getCode()))
                dto.setCode(bean.getCode());
            if(StringUtil.isNotEmpty(bean.getId()))
                dto.setLibelle(bean.getLibelle());
            if(this.quartier && bean.getQuartier()!= null)
                dto.setQuartierDto(quatierConverter.toDto(bean.getQuartier()));
            return dto;
        }

    }

    public void initObject(boolean value) {
        this.quartier = value;
    }

    public void copy(RueDto dto, Rue t) {
        super.copy(dto, t);
        if (dto.getQuartierDto() != null)
            quatierConverter.copy(dto.getQuartierDto(), t.getQuartier());
    }

    public QuatierConverter getQuatierConverter() {
        return quatierConverter;
    }

    public void setQuatierConverter(QuatierConverter quatierConverter) {
        this.quatierConverter = quatierConverter;
    }

    public boolean isQuartier() {
        return quartier;
    }

    public void setQuartier(boolean quartier) {
        this.quartier = quartier;
    }
}
