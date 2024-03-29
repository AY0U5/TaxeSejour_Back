package ma.zs.sejour.ws.converter.commun;

import ma.zs.sejour.bean.core.Taxe.TaxeSejourTrim;
import ma.zs.sejour.bean.core.commun.Locale;
import ma.zs.sejour.bean.core.commun.Quartier;
import ma.zs.sejour.ws.dto.Taxe.TaxeSejourTrimDto;
import ma.zs.sejour.ws.dto.commun.LocaleDto;
import ma.zs.sejour.ws.dto.commun.QuartierDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import ma.zs.sejour.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QuatierConverter extends AbstractConverter<Quartier, QuartierDto> {

    @Autowired
    private SecteurConverter secteurConverter;
    private boolean secteur;

    public  QuatierConverter() {
        super(Quartier.class, QuartierDto.class);
        init(true);
    }

    @Override
    public Quartier toItem(QuartierDto quartierDto){
        if (quartierDto == null) {
            return null;
        }else{
            Quartier bean = new Quartier();
            if(StringUtil.isNotEmpty(quartierDto.getId()))
                bean.setId(quartierDto.getId());
            if(StringUtil.isNotEmpty(quartierDto.getCode()))
                bean.setCode(quartierDto.getCode());
            if(StringUtil.isNotEmpty(quartierDto.getLibelle()))
                bean.setLibelle(quartierDto.getLibelle());
            if(this.secteur && quartierDto.getSecteurDto() != null && quartierDto.getSecteurDto().getId() != null)
                bean.setSecteur(secteurConverter.toItem(quartierDto.getSecteurDto()));
            return bean;
        }
    }




    @Override
    public QuartierDto toDto(Quartier bean){
        if (bean == null) {
            return null;
        }else{
            QuartierDto dto= new QuartierDto();
            if(StringUtil.isNotEmpty(bean.getId()))
                dto.setId(bean.getId());
            if(StringUtil.isNotEmpty(bean.getLibelle()))
                dto.setLibelle(bean.getLibelle());
            if(StringUtil.isNotEmpty(bean.getCode()))
                dto.setCode(bean.getCode());
            if(this.secteur && bean.getSecteur() != null)
                dto.setSecteurDto(secteurConverter.toDto(bean.getSecteur()));
            return dto;
        }
    }

    public void initObject(boolean value) {
        this.secteur = value;
    }

    public void copy(QuartierDto dto, Quartier t) {
        super.copy(dto, t);
        if (dto.getSecteurDto() != null)
            secteurConverter.copy(dto.getSecteurDto(), t.getSecteur());
    }

    public SecteurConverter getSecteurConverter() {
        return secteurConverter;
    }

    public void setSecteurConverter(SecteurConverter secteurConverter) {
        this.secteurConverter = secteurConverter;
    }

    public boolean isSecteur() {
        return secteur;
    }

    public void setSecteur(boolean secteur) {
        this.secteur = secteur;
    }
}
