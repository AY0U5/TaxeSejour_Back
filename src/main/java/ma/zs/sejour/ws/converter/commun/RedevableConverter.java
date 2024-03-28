package ma.zs.sejour.ws.converter.commun;

import ma.zs.sejour.bean.core.commun.Locale;
import ma.zs.sejour.bean.core.commun.Quartier;
import ma.zs.sejour.bean.core.commun.Redevable;
import ma.zs.sejour.ws.dto.commun.LocaleDto;
import ma.zs.sejour.ws.dto.commun.QuartierDto;
import ma.zs.sejour.ws.dto.commun.RedevableDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import org.springframework.stereotype.Component;

@Component
public class RedevableConverter extends AbstractConverter<Redevable, RedevableDto> {

    public  RedevableConverter() {
        super(Redevable.class, RedevableDto.class);
        init(true);
    }
    public Redevable toItem (RedevableDto redevableDto){
        Redevable bean = new Redevable();
        bean.setId(redevableDto.getId());
        bean.setCode(redevableDto.getCode());
        return bean;
    }

    public RedevableDto toDto (Redevable bean){
        RedevableDto dto = new RedevableDto();
        dto.setId(bean.getId());
        dto.setCode(bean.getCode());
        return dto;
    }
    public void initObject(boolean value) {
    }
}
