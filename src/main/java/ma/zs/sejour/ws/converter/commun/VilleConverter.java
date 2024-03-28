package ma.zs.sejour.ws.converter.commun;

import ma.zs.sejour.bean.core.commun.TypeRedevable;
import ma.zs.sejour.bean.core.commun.Ville;
import ma.zs.sejour.ws.dto.commun.TypeRedevableDto;
import ma.zs.sejour.ws.dto.commun.VilleDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import org.springframework.stereotype.Component;

@Component
public class VilleConverter extends AbstractConverter<Ville, VilleDto> {


    public  VilleConverter() {
        super(Ville.class, VilleDto.class);
        init(true);
    }

    @Override
    public Ville toItem (VilleDto villeDto){
        Ville bean  = new Ville();
        bean.setId(villeDto.getId());
        bean.setLibelle(villeDto.getLibelle());
        return bean ;
    }


    @Override
    public VilleDto  toDto (Ville bean){
        VilleDto dto =new VilleDto();
        dto.setId(bean.getId());
        dto.setLibelle(bean.getLibelle());
        return dto ;
    }


    public void initObject(boolean value) {
    }
}
