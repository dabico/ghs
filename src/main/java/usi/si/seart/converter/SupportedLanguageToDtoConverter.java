package usi.si.seart.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import usi.si.seart.dto.SupportedLanguageDto;
import usi.si.seart.model.SupportedLanguage;

public class SupportedLanguageToDtoConverter  implements Converter<SupportedLanguage, SupportedLanguageDto> {

    @Override
    @NonNull
    public SupportedLanguageDto convert(@NonNull SupportedLanguage source) {
        return SupportedLanguageDto.builder()
                .id(source.getId())
                .language(source.getName())
                .build();
    }
}
