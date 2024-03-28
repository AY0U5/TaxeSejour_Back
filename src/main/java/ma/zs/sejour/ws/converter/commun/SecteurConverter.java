package ma.zs.sejour.ws.converter.commun;

import ma.zs.sejour.bean.core.commun.Rue;
import ma.zs.sejour.bean.core.commun.Secteur;
import ma.zs.sejour.ws.dto.commun.RueDto;
import ma.zs.sejour.ws.dto.commun.SecteurDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import org.springframework.stereotype.Component;

@Component
public class SecteurConverter extends AbstractConverter<Secteur, SecteurDto> {

    public  SecteurConverter() {
        super(Secteur.class, SecteurDto.class);
        init(true);
    }

    @Override
    public Secteur toItem (SecteurDto dto){
        Secteur bean = new Secteur();
        bean.setId(dto.getId());
        bean.setCode(dto.getCode());
        bean.setLibelle(dto.getLibelle());
        return bean;
    }

    @Override
    public SecteurDto toDto (Secteur bean){
        SecteurDto dto = new SecteurDto();
        dto.setId(bean.getId());
        dto.setCode(bean.getCode());
        dto.setLibelle(bean.getLibelle());
        return dto;
    }





    public void initObject(boolean value) {
    }
}
