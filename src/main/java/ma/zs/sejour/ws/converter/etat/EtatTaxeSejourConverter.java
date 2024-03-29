package ma.zs.sejour.ws.converter.etat;

import ma.zs.sejour.bean.core.Etat.EtatTaxeSejour;
import ma.zs.sejour.bean.core.Taxe.TaxeSejourTrim;
import ma.zs.sejour.bean.core.commun.TypeRedevable;
import ma.zs.sejour.ws.converter.commun.SecteurConverter;
import ma.zs.sejour.ws.dto.Taxe.TaxeSejourTrimDto;
import ma.zs.sejour.ws.dto.commun.TypeRedevableDto;
import ma.zs.sejour.ws.dto.etat.EtatTaxeSejourDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import ma.zs.sejour.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EtatTaxeSejourConverter extends AbstractConverter<EtatTaxeSejour, EtatTaxeSejourDto> {


    @Autowired
    private SecteurConverter secteurConverter;

    private boolean secteur;

    public  EtatTaxeSejourConverter() {
        super(EtatTaxeSejour.class, EtatTaxeSejourDto.class);
        init(true);
    }

    public EtatTaxeSejour toItem(EtatTaxeSejourDto etatTaxeSejourDto){
        if (etatTaxeSejourDto == null) {
            return null;
        }else{
            EtatTaxeSejour bean = new EtatTaxeSejour();
            if(StringUtil.isNotEmpty(etatTaxeSejourDto.getId()))
                bean.setId(etatTaxeSejourDto.getId());
            if(StringUtil.isNotEmpty(etatTaxeSejourDto.getCode()))
                bean.setCode(etatTaxeSejourDto.getCode());
            if(StringUtil.isNotEmpty(etatTaxeSejourDto.getLibelle()))
                bean.setLibelle(etatTaxeSejourDto.getLibelle());
            if(this.secteur && etatTaxeSejourDto.getSecteurDto() != null && etatTaxeSejourDto.getSecteurDto().getId() != null)
                bean.setSecteur(secteurConverter.toItem(etatTaxeSejourDto.getSecteurDto()));
            return bean;
        }

    }




    public EtatTaxeSejourDto toDto(EtatTaxeSejour bean){
        if (bean == null) {
            return null;
        }
        EtatTaxeSejourDto dto= new EtatTaxeSejourDto();
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

    public void initObject(boolean value) {
        this.secteur = value;
    }

    public void copy(EtatTaxeSejourDto dto, EtatTaxeSejour t) {
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


