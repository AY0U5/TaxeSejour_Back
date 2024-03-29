package ma.zs.sejour.ws.converter.commun;

import ma.zs.sejour.bean.core.Taxe.TaxeSejourTrim;
import ma.zs.sejour.bean.core.commun.Rue;
import ma.zs.sejour.bean.core.commun.Secteur;
import ma.zs.sejour.ws.dto.Taxe.TaxeSejourTrimDto;
import ma.zs.sejour.ws.dto.commun.RueDto;
import ma.zs.sejour.ws.dto.commun.SecteurDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import ma.zs.sejour.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecteurConverter extends AbstractConverter<Secteur, SecteurDto> {
    @Autowired
    private VilleConverter villeConverter;

    private boolean ville;

    public  SecteurConverter() {
        super(Secteur.class, SecteurDto.class);
        init(true);
    }

    @Override
    public Secteur toItem (SecteurDto dto){
        if (dto == null) {
            return null;
        }else{
            Secteur bean = new Secteur();
            if(StringUtil.isNotEmpty(dto.getId()))
                bean.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                bean.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                bean.setLibelle(dto.getLibelle());
            if(this.ville && dto.getVilleDto() != null && dto.getVilleDto().getId() != null)
                bean.setVille(villeConverter.toItem(dto.getVilleDto()));
            return bean;
        }

    }

    @Override
    public SecteurDto toDto (Secteur bean){
        if (bean == null) {
            return null;
        }else{
            SecteurDto dto = new SecteurDto();
            if(StringUtil.isNotEmpty(bean.getId()))
                dto.setId(bean.getId());
            if(StringUtil.isNotEmpty(bean.getCode()))
                dto.setCode(bean.getCode());
            if(StringUtil.isNotEmpty(bean.getLibelle()))
                dto.setLibelle(bean.getLibelle());
            if(this.ville && bean.getVille() != null && bean.getVille().getId() != null)
                dto.setVilleDto(villeConverter.toDto(bean.getVille()));
            return dto;
        }

    }





    public void initObject(boolean value) {
        this.ville = value;
    }

    public void copy(SecteurDto dto, Secteur t) {
        super.copy(dto, t);
        if (dto.getVilleDto() != null)
            villeConverter.copy(dto.getVilleDto(), t.getVille());
    }


    public VilleConverter getVilleConverter() {
        return villeConverter;
    }

    public void setVilleConverter(VilleConverter villeConverter) {
        this.villeConverter = villeConverter;
    }

    public boolean isVille() {
        return ville;
    }

    public void setVille(boolean ville) {
        this.ville = ville;
    }
}
