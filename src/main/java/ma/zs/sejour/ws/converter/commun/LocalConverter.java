package ma.zs.sejour.ws.converter.commun;

import ma.zs.sejour.bean.core.commun.Employe;
import ma.zs.sejour.bean.core.commun.Locale;
import ma.zs.sejour.ws.dto.commun.EmployeDto;
import ma.zs.sejour.ws.dto.commun.LocaleDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import org.springframework.stereotype.Component;


@Component
public class LocalConverter  extends AbstractConverter<Locale, LocaleDto> {


    public  LocalConverter() {
        super(Locale.class, LocaleDto.class);
        init(true);
    }


    @Override
    public Locale toItem (LocaleDto localeDto){
        Locale bean  = new Locale();
        bean.setId(localeDto.getId());
        bean.setCode(localeDto.getCode());
        bean.setLibelle(localeDto.getLibelle());
        return bean ;
    }

    @Override
    public LocaleDto  toDto (Locale bean){
        LocaleDto dto =new LocaleDto();
        dto.setId(bean.getId());
        dto.setCode(bean.getCode());
        dto.setLibelle(bean.getLibelle());
        return dto ;
    }


    public void initObject(boolean value) {
    }

}
