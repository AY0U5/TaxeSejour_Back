package  ma.zs.sejour.ws.converter.taux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.zs.sejour.zynerator.util.StringUtil;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import ma.zs.sejour.zynerator.util.DateUtil;
import ma.zs.sejour.bean.core.taux.TauxTaxeSejourTrim;
import ma.zs.sejour.ws.dto.taux.TauxTaxeSejourTrimDto;

@Component
public class TauxTaxeSejourTrimConverter extends AbstractConverter<TauxTaxeSejourTrim, TauxTaxeSejourTrimDto> {


    public  TauxTaxeSejourTrimConverter() {
        super(TauxTaxeSejourTrim.class, TauxTaxeSejourTrimDto.class);
    }

    @Override
    public TauxTaxeSejourTrim toItem(TauxTaxeSejourTrimDto dto) {
        if (dto == null) {
            return null;
        } else {
        TauxTaxeSejourTrim item = new TauxTaxeSejourTrim();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCategorieSejourCode()))
                item.setCategorieSejourCode(dto.getCategorieSejourCode());
            if(StringUtil.isNotEmpty(dto.getMontantNuit()))
                item.setMontantNuit(dto.getMontantNuit());
            if(StringUtil.isNotEmpty(dto.getPourcentagePremierMoisRetard()))
                item.setPourcentagePremierMoisRetard(dto.getPourcentagePremierMoisRetard());
            if(StringUtil.isNotEmpty(dto.getPourcentageAutreMoisRetard()))
                item.setPourcentageAutreMoisRetard(dto.getPourcentageAutreMoisRetard());
            if(StringUtil.isNotEmpty(dto.getEmploye()))
                item.setEmploye(dto.getEmploye());



        return item;
        }
    }

    @Override
    public TauxTaxeSejourTrimDto toDto(TauxTaxeSejourTrim item) {
        if (item == null) {
            return null;
        } else {
            TauxTaxeSejourTrimDto dto = new TauxTaxeSejourTrimDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCategorieSejourCode()))
                dto.setCategorieSejourCode(item.getCategorieSejourCode());
            if(StringUtil.isNotEmpty(item.getMontantNuit()))
                dto.setMontantNuit(item.getMontantNuit());
            if(StringUtil.isNotEmpty(item.getPourcentagePremierMoisRetard()))
                dto.setPourcentagePremierMoisRetard(item.getPourcentagePremierMoisRetard());
            if(StringUtil.isNotEmpty(item.getPourcentageAutreMoisRetard()))
                dto.setPourcentageAutreMoisRetard(item.getPourcentageAutreMoisRetard());
            if(StringUtil.isNotEmpty(item.getEmploye()))
                dto.setEmploye(item.getEmploye());


        return dto;
        }
    }




    public void initObject(boolean value) {
    }


}
