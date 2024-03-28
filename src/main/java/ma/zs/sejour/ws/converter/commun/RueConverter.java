package ma.zs.sejour.ws.converter.commun;

import ma.zs.sejour.bean.core.commun.Redevable;
import ma.zs.sejour.bean.core.commun.Rue;
import ma.zs.sejour.ws.dto.commun.RedevableDto;
import ma.zs.sejour.ws.dto.commun.RueDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import org.springframework.stereotype.Component;

@Component
public class RueConverter extends AbstractConverter<Rue, RueDto> {

    public  RueConverter() {
        super(Rue.class, RueDto.class);
        init(true);
    }

    @Override
    public Rue toItem(RueDto dto) {
        Rue bean = new Rue();
        bean.setId(dto.getId());
        bean.setCode(dto.getCode());
        bean.setLibelle(dto.getLibelle());
        return bean;
    }

    @Override
    public RueDto toDto(Rue bean) {
        RueDto dto = new RueDto();
        dto.setId(bean.getId());
        dto.setCode(bean.getCode());
        dto.setLibelle(bean.getLibelle());
        return dto;
    }

    public void initObject(boolean value) {
    }

}
