package jp.dip.snowsaber.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {


	@Bean
	public Docket apiExample() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(assertTargetPath())	// 表示対象の絞り込み
				.build()
				.apiInfo(apiInfo()) // アプリ情報を付与
				.useDefaultResponseMessages(false) // デフォルトのレスポンスコードのメッセージの追加有無  
				;
	}

	/**
	 * アプリ情報の生成
	 * 
	 * @return アプリ情報
	 */
	private ApiInfo apiInfo() {
		// タイトル
		String title = "SpringFox Example API";
		// 説明
		String description = "SpringFoxの機能を確認するためのサンプルアプリケーション";
		// バージョン
		String version = "v2.0.0";
		// 利用規約URL
		String termsOfServiceUrl = "http://localhost:8080/dummy";
		// 連絡先
		String name = "連絡先名";
		String url = "連絡先WebSiteURL";
		String email = "連絡先メールアドレス";
		Contact contact = new Contact(name, url, email);
		// ライセンス
		String license = "example-license";
		// ライセンスURL
		String licenseUrl = "http://localhost:8080/licenseUrl";
		// 拡張用のドキュメント
		Collection<VendorExtension> vendorExtensions = new ArrayList<>();
		ApiInfo apiInfo = new ApiInfo(title, description, version, termsOfServiceUrl, contact, license, licenseUrl,
				vendorExtensions);
		return apiInfo;
	}
	
	/**
	 * 対象のPATHの絞り込み用のPredicateメソッド
	 * 
	 * @return 対象のPATHの絞り込み用のPredicate 
	 */
    private Predicate<String> assertTargetPath() {
    	List<String> apiList = Arrays.asList("/insert");
        return new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return apiList.contains(t);
			}
        	
        };
    }
}
