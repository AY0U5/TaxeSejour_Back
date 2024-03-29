package ma.zs.sejour.ws.converter.commun;

import ma.zs.sejour.bean.core.Taxe.TaxeSejourTrim;
import ma.zs.sejour.bean.core.commun.Employe;
import ma.zs.sejour.bean.core.commun.Locale;
import ma.zs.sejour.bean.core.commun.Rue;
import ma.zs.sejour.ws.converter.taux.TauxTaxeSejourTrimConverter;
import ma.zs.sejour.ws.dto.Taxe.TaxeSejourTrimDto;
import ma.zs.sejour.ws.dto.commun.EmployeDto;
import ma.zs.sejour.ws.dto.commun.LocaleDto;
import ma.zs.sejour.ws.dto.commun.RueDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import ma.zs.sejour.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class LocalConverter  extends AbstractConverter<Locale, LocaleDto> {

    @Autowired
    private RueConverter rueConverter;
    @Autowired
    private CategorieSejourConverter categorieSejourConverter;
    @Autowired
    private RedevableConverter redevableConverter;

    private boolean rue;
    private boolean redevable;
    private boolean categorie;

    public  LocalConverter() {
        super(Locale.class, LocaleDto.class);
        init(true);
    }


    @Override
    public Locale toItem (LocaleDto localeDto){
        if (localeDto == null) {
            return null;
        }else{
            Locale bean  = new Locale();
            if(StringUtil.isNotEmpty(localeDto.getId()))
                bean.setId(localeDto.getId());
            if(StringUtil.isNotEmpty(localeDto.getCode()))
                bean.setCode(localeDto.getCode());
            if(StringUtil.isNotEmpty(localeDto.getLibelle()))
                bean.setLibelle(localeDto.getLibelle());
            if(this.rue && localeDto.getRueDto() != null && localeDto.getRueDto().getId()!=null)
                bean.setRue(rueConverter.toItem(localeDto.getRueDto()));
            if(this.redevable && localeDto.getRedevableDto() != null && localeDto.getRedevableDto().getId()!=null)
                bean.setRedevable(redevableConverter.toItem(localeDto.getRedevableDto()));
            if(this.categorie && localeDto.getCategorieSejourDto() != null && localeDto.getCategorieSejourDto().getId()!=null)
                bean.setCategorieSejour(categorieSejourConverter.toItem(localeDto.getCategorieSejourDto()));
            return bean ;
        }
    }

    @Override
    public LocaleDto  toDto (Locale bean){
        if (bean == null) {
            return null;
        }else{
            LocaleDto dto =new LocaleDto();
            if(StringUtil.isNotEmpty(bean.getId()))
                dto.setId(bean.getId());
            if(StringUtil.isNotEmpty(bean.getCode()))
                dto.setCode(bean.getCode());
            if(StringUtil.isNotEmpty(bean.getLibelle()))
                dto.setLibelle(bean.getLibelle());
            if(this.rue && bean.getRue()!=null)
                dto.setRueDto(rueConverter.toDto(bean.getRue()));
            if(this.redevable && bean.getRedevable()!=null)
                dto.setRedevableDto(redevableConverter.toDto(bean.getRedevable()));
            if(this.categorie && bean.getCategorieSejour()!=null)
                dto.setCategorieSejourDto(categorieSejourConverter.toDto(bean.getCategorieSejour()));
            return dto ;
        }
    }

    public void initObject(boolean value) {
        this.categorie = value;
        this.rue = value;
        this.redevable = value;
    }

    public void copy(LocaleDto dto, Locale t) {
        super.copy(dto, t);
        if (dto.getCategorieSejourDto() != null)
            categorieSejourConverter.copy(dto.getCategorieSejourDto(), t.getCategorieSejour());
        if (dto.getRedevableDto() != null)
            redevableConverter.copy(dto.getRedevableDto(), t.getRedevable());
        if (dto.getRueDto() != null)
            rueConverter.copy(dto.getRueDto(), t.getRue());
    }

    public CategorieSejourConverter getCategorieSejourConverter(){
        return this.categorieSejourConverter;
    }
    public void setCategorieSejourConverter(CategorieSejourConverter categorieSejourConverter ){
        this.categorieSejourConverter = categorieSejourConverter;
    }

    public RueConverter getRueConverter() {
        return rueConverter;
    }

    public void setRueConverter(RueConverter rueConverter) {
        this.rueConverter = rueConverter;
    }

    public RedevableConverter getRedevableConverter() {
        return redevableConverter;
    }

    public void setRedevableConverter(RedevableConverter redevableConverter) {
        this.redevableConverter = redevableConverter;
    }

    public boolean isRue() {
        return rue;
    }

    public void setRue(boolean rue) {
        this.rue = rue;
    }

    public boolean isRedevable() {
        return redevable;
    }

    public void setRedevable(boolean redevable) {
        this.redevable = redevable;
    }

    public boolean isCategorie() {
        return categorie;
    }

    public void setCategorie(boolean categorie) {
        this.categorie = categorie;
    }
}
