package ma.zs.sejour.ws.converter.commun;

import ma.zs.sejour.bean.core.commun.Locale;
import ma.zs.sejour.bean.core.commun.Quartier;
import ma.zs.sejour.ws.dto.commun.LocaleDto;
import ma.zs.sejour.ws.dto.commun.QuartierDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import org.springframework.stereotype.Component;

@Component
public class QuatierConverter extends AbstractConverter<Quartier, QuartierDto> {



    public  QuatierConverter() {
        super(Quartier.class, QuartierDto.class);
        init(true);
    }

    @Override
    public Quartier toItem(QuartierDto quartierDto){

        Quartier bean = new Quartier();
        bean.setId(quartierDto.getId());
        bean.setLibelle(quartierDto.getLibelle());
        return bean;}




    @Override
    public QuartierDto toDto(Quartier bean){

        QuartierDto dto= new QuartierDto();
        bean.setId(bean.getId());
        bean.setLibelle(bean.getLibelle());
        bean.setCode(bean.getCode());
        bean.setSecteur(bean.getSecteur());
        return dto;}

    public void initObject(boolean value) {
    }

}
