package ma.zs.sejour.ws.converter.commun;

import ma.zs.sejour.bean.core.commun.TypeRedevable;
import ma.zs.sejour.bean.core.commun.Ville;
import ma.zs.sejour.ws.dto.commun.TypeRedevableDto;
import ma.zs.sejour.ws.dto.commun.VilleDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import ma.zs.sejour.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class VilleConverter extends AbstractConverter<Ville, VilleDto> {


    public  VilleConverter() {
        super(Ville.class, VilleDto.class);
        init(true);
    }

    @Override
    public Ville toItem (VilleDto villeDto){
        if (villeDto == null) {
            return null;
        }
        Ville bean  = new Ville();
        if(StringUtil.isNotEmpty(villeDto.getId()))
            bean.setId(villeDto.getId());
        if(StringUtil.isNotEmpty(villeDto.getLibelle()))
            bean.setLibelle(villeDto.getLibelle());
        if(StringUtil.isNotEmpty(villeDto.getCode()))
            bean.setCode(villeDto.getCode());
        return bean ;
    }


    @Override
    public VilleDto  toDto (Ville bean){
        if (bean == null) {
            return null;
        }
        VilleDto dto =new VilleDto();
        if(StringUtil.isNotEmpty(bean.getId()))
            dto.setId(bean.getId());
        if(StringUtil.isNotEmpty(bean.getCode()))
            dto.setCode(bean.getCode());
        if(StringUtil.isNotEmpty(bean.getLibelle()))
            dto.setLibelle(bean.getLibelle());
        return dto ;
    }


}
