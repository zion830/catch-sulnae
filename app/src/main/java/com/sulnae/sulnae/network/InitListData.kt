package com.sulnae.sulnae.network

import android.util.Log
import com.depromeet.mannaja.Retrofit.CallBack
import com.sulnae.sulnae.R
import com.sulnae.sulnae.`object`.Alcohol
import plantopia.sungshin.plantopia.User.RetrofitService

class InitListData {
    val alcoholList: ArrayList<Alcohol> = arrayListOf(
            Alcohol(1, "참이슬 16.9", R.drawable.img17, "16.9% 도수로 라이트 유저의 입맛에 맞춰 깔끔한 목넘김을 완성한 소주", 0.0, 16.9),
            Alcohol(2, "참이슬 classic", R.drawable.img16, "숙취 유발 물질을 깨끗하게 제거하고 레귤러 대비 높은 도수로, 깊고 진한 맛을 구현해 소비자들에게 꾸준히 사랑받는 소주", 0.0, 20.1),
            Alcohol(3, "참이슬 fresh", R.drawable.img15, "대한민국 청정지역에서만 선별된 대나무 숯으로 4번 걸러 더 깨끗한 목넘김을 가진 소주", 0.0, 17.2),
            Alcohol(4, "자몽에 이슬", R.drawable.img21, "자몽과 참이슬이 만나, 상큼함과 청량감은 더하고 13도의 도수로 부담을 낮춘 소주", 0.0, 13.0),
            Alcohol(5, "청포도에 이슬", R.drawable.img18, "달콤한 청포도가 깨끗한 이슬을 만나, 달콤함과 청량감은 한층 업그레이드 되고 13도의 도수로 부담 없이 즐길 수 있는 소주", 0.0, 13.0),
            Alcohol(6, "자두에 이슬", R.drawable.img19, "비타민C와 식이섬유가 풍부하게 함유된 자두의 싱그럽고 상큼함이 13도의 부담 없는 도수와 깨끗한 이슬과 만나 탄생된 소주", 0.0, 13.0),
            Alcohol(7, "처음처럼", R.drawable.img2, "세계 최초 알칼리환원수로 만든 소주", 0.0, 17.0),
            Alcohol(8, "순하리 유자", R.drawable.img4, "/'소주 베이스 칵테일/' 시장 개철, 유자 특유의 새콤달콤한 맛과 부드러운 목넘김이 특징", 0.0, 14.0),
            Alcohol(9, "순하리 복숭아", R.drawable.img3, "복숭아 특유의 새콤달콤한 맛과 부드러운 목넘김이 특징", 0.0, 12.0),
            Alcohol(10, "순하리 사과", R.drawable.img14, "사과 특유의 새콤달콤한 맛과 부드러운 목넘김이 특징", 0.0, 12.0),
            Alcohol(11, "청하", R.drawable.img7, "쌀을 저온 발효시켜 만든, 깔끔한 맛과 향을 자랑하는 청주", 0.0, 13.0),
            Alcohol(12, "매화수", R.drawable.img23, "젊은층이 선호하는 감각적이고 세련된 디자인! 합리적인 가격의 대중 매실주!", 0.0, 14.0),

            Alcohol(13, "좋은데이", R.drawable.img6, "72시간 산소숙성과 10단계 여과로 부드러운 소주", 0.0, 16.9),
            Alcohol(14, "좋은데이 깔라만시", R.drawable.img8, "당 함량을 99% 낮춘 톡 쏘는 맛의 소주", 0.0, 12.5),
            Alcohol(15, "좋은데이 유자", R.drawable.img10, "", 0.0, 13.5),
            Alcohol(16, "좋은데이 자몽", R.drawable.img11, "", 0.0, 13.5),
            Alcohol(17, "좋은데이 블루베리", R.drawable.img12, "", 0.0, 13.5),
            Alcohol(18, "좋은데이 파인애플", R.drawable.img9, "", 0.0, 13.5),
            Alcohol(19, "좋은데이 석류", R.drawable.img13, "", 0.0, 13.5),

            Alcohol(20, "한라산", R.drawable.img5, "천연암반수를 해저 80m 아래에서 뽑아 자연수 상태로 사용하는 소주", 0.0, 21.0),
            Alcohol(21, "잎새주", R.drawable.img1, "  전라남도와 광주광역시에서 제일 잘 팔리는 소주", 0.0, 17.8),
            Alcohol(22, "시원한청풍", R.drawable.img20, "아스파라긴을 첨가하여 숙취해소에 좋은 부드러운 소주", 0.0, 17.5),
            Alcohol(23, "화이트", R.drawable.img22, " 저도수 + 숙취 해소에 집중하여 생산하는 소주", 0.0, 19.0),
            Alcohol(24, "C1 (오리지널)", R.drawable.img24, "  국내 최초로 제조과정에 음악을 들려주는 음향숙성진동공법을 도입한 소주", 0.0, 19.0),
            Alcohol(27, "맛있는 참", R.drawable.img25, "쌀, 보리, 현미, 고구마, 타피오카 등의 순수곡물을 원료로 사용한 소주", 0.0, 16.9),
            Alcohol(33, "O2린", R.drawable.img26, "숙취를 줄이기 위해 다른 소주보다 3배가량 더 많은 산소를 주입한 소주", 0.0, 17.8),
            Alcohol(28, "순한참 유자", R.drawable.img27, "", 0.0, 14.0),
            Alcohol(29, "순한참 애플망고", R.drawable.img28, "", 0.0, 14.0),
            Alcohol(30, "순한참 청포도", R.drawable.img29, "", 0.0, 14.0),
            Alcohol(31, "순한참 블루베리", R.drawable.img30, "", 0.0, 14.0),
            Alcohol(32, "순한참 자몽", R.drawable.img31, "", 0.0, 14.0),
            Alcohol(25, "C1블루 자몽", R.drawable.img32, " 자몽과 레몬, 벌꿀 등이 들어가 상큼한 신맛이 풍부하고 깔끔한 단맛이 특징인 소주", 0.0, 14.0),
            Alcohol(26, "C1블루 로즈", R.drawable.img33, " 마테잎차와 벌꿀, 식물성 단백질 감미료인 토마틴이 들어간 소주", 0.0, 15.8),
            Alcohol(34, "OB 프리미어(OB Premier Pilsner)", R.drawable.ob_premier, "100% 독일 노블홉과 독일 황실 양조장 효모를 사용해 만든 깊고 풍부한 맛과 향이 느껴지는 정통 독일식 올몰트(All Malt)맥주입니다.", 0.0, 5.2),
            Alcohol(35, "카스 프레시(Cass Fresh)", R.drawable.cass_fresh, "카스 프레시는 비열처리공법으로 맥주의 신선하고 톡 쏘는 맛을 더욱 향상시켰습니다.", 0.0, 4.5),
            Alcohol(36, "하이트 엑스트라 콜드(hite EXTRA COLD)", R.drawable.extra_cold, "숙성에서부터 여과까지 생산 전 공정을 맥주가 얼기 직전, 영하의 온도에서 제조하여 시원하고 청량한 페일라거 맥주 본연의 맛을 극대화", 0.0, 4.5),
            Alcohol(37, "맥스(Max)", R.drawable.max, "숙성에서부터 여과까지 생산 전 공정을 맥주가 얼기 직전, 영하의 온도에서 제조하여 시원하고 청량한 페일라거 맥주 본연의 맛을 극대화", 0.0, 4.5),
            Alcohol(38, "드라이 d", R.drawable.d, "드라이공법으로 잔미를 제거하여 극대화된 시원함. 덴마크 덴부르사와의 5년간의 공동연구, 2년 2개월여에 걸친 소비자 조사를 통해 맥주 맛을 완성하다.", 0.0, 4.8),
            Alcohol(39, "S", R.drawable.s, "1/3 더 낮아진 칼로리로 탄생한 Premium Light Beer! 부드러운 목 넘김, 마지막까지 상쾌한 느낌! 다이어트와 웰빙까지 생각하는 스타일리시 맥주! 식이섬유가 더해져 다이어트와 웰빙까지 생각하는 맥주", 0.0, 3.8),
            Alcohol(40, "스타우트 (BLACK stout)", R.drawable.stout, "누구나 가볍게 즐길 수 있는 부드럽고 깔끔한 라거타입 흑맥주, 스타우트!", 0.0, 5.0),
            Alcohol(41, "퀸즈 에일 (QUEEN’S ALE)", R.drawable.queen, "맥주 맛이 가진 의미와 깊이를 이해하는 인생의 탐험가를 위하여 트리플 호핑과 꿀바디감의 깊고 풍부한 전통 Premium Pale Ale 맥주", 0.0, 5.4),
            Alcohol(42, "클라우드(Kloud)", R.drawable.kloud, "오리지널 그래비티 공법이란 비가수 공법으로 발효한 맥주원액에 물을 타지 않고 발효원액 그대로 제품을 담아내는 제조방법이다. 풍부한 거품과 풍부한 맛이 특징", 0.0, 5.0),
            Alcohol(43, "피츠 수퍼 클리어(Fitz Super Clear)", R.drawable.fitz, "하이트나 카스보다도 더 밍밍한 맛이 특징이다.", 0.0, 4.5),
            Alcohol(44, "인디아 페일 에일(India Pale Ale)", R.drawable.india, "많은 양의 홉과 몰트를 사용해 풍부한 향을 지니고 있으며, 크림처럼 부드러운 거품과 달콤하면서도 쌉쌀한 맛이 어우러져 목안에 오랫동안 여운을 남깁니다.", 0.0, 5.5),
            Alcohol(45, "강서 마일드 에일(GANGSEO MILD ALE)", R.drawable.gangseo, "IBU 25로 가볍게 즐길 수 있는 마일드에일로 몰트의 고소함과 오렌지, 망고등에서 느껴지는 시트러스향이 특징입니다.", 0.0, 4.6),
            Alcohol(46, "달서 오렌지 에일(DALSEO ORANGE ALE)", R.drawable.dalseo, "밀몰트와 보리몰트를 혼합, 발효시켜 부드러운 밀향에 오렌지향을 가미시킨 밀맥주로 부드러운 바닐라 풍미에 과하지 않은 상큼한 오렌지향이 특징입니다.", 0.0, 4.2),
            Alcohol(47, "전라에일 (JEOLLA ALE)", R.drawable.jeolla, "에일맥주지만 라거처럼 깔끔한 맛으로 가볍게 즐길 수 있고, 플로럴과 시트러스향을 함께 느낄 수 있습니다.", 0.0, 4.5),
            Alcohol(48, "서초 위트(SEOCHO WHEAT)", R.drawable.seocho, "가장 편하게 마실 수 있는 밀맥주로 밀맥주 특유의 바나나의 풍미를 느낄 수 있는 맥주이다", 0.0, 4.2),
            Alcohol(49, "바이젠 (Weizen)", R.drawable.weizen, "세븐브로이맥주의 대표 밀 맥주입니다. 보리 맥아와 밀 맥아를 함께 사용해 밀 맥아 특유의 구수한 맛을 느낄 수 있는 맥주로, 크리스탈 몰트를 사용해 목 넘김이 부드럽고 새콤한 산미를 느낄 수 있습니다.", 0.0, 4.2),
            Alcohol(50, "골든에일(GOLDEN ALE)", R.drawable.golden, "페일에일에서 IBU(쓴맛)를 줄이고 붉은색 에일맥주가 아닌 황금색의 에일맥주로 향을 부각시킨것이 특징입니다.", 0.0, 4.5),
            Alcohol(51, "한강에일(Hangang Ale)", R.drawable.hangang, "밀 맥아를 베이스로 하여 부드럽고 조밀한 거품이 특징으로 맥아의 단 맛과 오렌지 껍질의 상큼함이 청량감을 높여 편안하게 마실 수 있는 맥주입니다.", 0.0, 5.2),
            Alcohol(52, "서울 에일(Seoul Soul Ale)", R.drawable.seoul, "미국산 홉의 깔끔한 쓴 맛과 프리미엄 맥아의 은은한 단맛이 조화를 이루며 드라이 호핑 공법을 통해 입안과 코 끝에 남는 홉 향기가 특징인 맥주입니다.", 0.0, 5.0),
            Alcohol(53, "ㅋ IPA(장기하맥주)", R.drawable.z, "소문난 주당! 장기하와 얼굴들과 함께 만든 맥주. 감귤, 망고, 열대과일의 향이 빵 터지는 세션 IPA. 잔을 비울수록 이름 그대로 자꾸 웃음이 나오는 매력만점 맥주. 장얼의 신곡 ‘ㅋ’을 들으면서 한두잔 들이키다 보면 어느새 내 마음은 ㅋㅋㅋ", 0.0, 4.5),
            Alcohol(54, "오늘 페일에일(TODAY PALE ALE)", R.drawable.today, "감귤과 열대 과일의 향이 코 끝을 사로잡는 황금빛 페일에일.", 0.0, 5.0),
            Alcohol(55, "대강 페일에일(TAEGANG PALE ALE)", R.drawable.taegang, "북한의 대동강 맥주보다 맛있는 대강 페일에일. 오렌지, 감귤, 청포도의 상큼한 과일향에 이은 고소한 몰트의 맛, 쌉싸래한 홉의 밸런스. 모두에게 사랑받는 맥주.", 0.0, 4.6),
            Alcohol(56, "해운대(HAEUNDAE)", R.drawable.haeundae, "시원하게, 해운대 바다처럼 시원하고 상쾌하며 파인애플 향이 살아있는 썸머에일. 깨끗하고 밝은 옅은 금빛에 은한 파인애플 향과 고소한 몰트 향이 상쾌한 맥주로 여름에 잘 어울린다.", 0.0, 4.2),
            Alcohol(57, "서빙고 트리플 에일(SEO BING GO)", R.drawable.seobinggo, "국내최초로 벨기에 수도원 맥주를 완벽하게 재현한 트리펠 맥주. 알코올 함량이 8.5%로 한국에서 만들어진 맥주들 중 가장 높으며, 벨지안 효모가 만들어 내는 화사하고 산뜻한 과실 풍미에 풍성한 바디감이 매력적으로 와인처럼 음미할 수 있는 맥주.", 0.0, 8.5),
            Alcohol(58, "광화문 엠버 에일(GWANGHWAMUN)", R.drawable.gwanghwamun, "마일드한 커피 같은 도시형 엠버 에일 연한 커피 같은 깔끔한 엠버 에일로 캐러멜 몰트와 맥문동의 균형감은 도심 속의 밸런스를 표현합니다.", 0.0, 5.0),
            Alcohol(59, "여수 나이트 에일(YEOSU)", R.drawable.yeosu, "물의 도시인 여수 바다를 떠올리게 하는 맑고 짙은 색상의 엠버 에일로, 전라도산 보리를 사용한 고소하고 담백한 맛이 특징이다. 카라멜 몰트에서 느껴지는 고소한 견과류, 커피 아로마와 전라도 산 호품 보리 특유의 바디감이 훌륭한 균형을 이루며 쌉쌀한 봄바다 같은 여운을 선사한다.", 0.0, 5.0),
            Alcohol(60, "평창 화이트 에일(PYEONGCHANG WHITE ALE)", R.drawable.pyeongchang, "눈과 설원의 도시, 겨울의 낭만을 간직한 평창을 모티브로 탄생한 화이트 에일 맥주. 고소한 옥수수향과 신선한 몰트 향의 아로마가 조화롭게 어우러지는 새로운 스타일의 맥주로, 벨지안 효모에서 오는 과일향과 더불어 국산 옥수수와 옥수수수염을 사용한 구수한 마무리가 특징. 미디엄 바디로 달지 않고, 맑고 쨍한 겨울 추위 같은 깔끔한 담백함을 즐길 수 있는 맥주.", 0.0, 4.9),
            Alcohol(61, "불싸조(BULSSAJO)", R.drawable.bulssajo, "향긋하게 마실 수 있는 세션(Session) 에일. 기존의 스타일에 얽매이지 않는 자유로움이 돋보이는 맥주로 상쾌한 솔 향으로 시작해 카라멜 몰트의 은은한 바디감으로 마무리된다. 훌륭한 맛의 균형을 즐길 수 있는 맥주.", 0.0, 5.0),
            Alcohol(62, "제주 위트 에일(JEJU WIT ALE)", R.drawable.jeju_wit, "제주 위트 에일은 밀맥주의 부드러움과 제주 유기농 감귤껍질의 은은한 향이 만나 산뜻한 끝맛을 선사합니다.", 0.0, 5.3),
            Alcohol(63, "제주 펠롱 에일(JEJU PELLONG ALE)", R.drawable.jeju_pellong, "‘펠롱’은 ‘반짝’ 이라는 의미의 제주 방언입니다. 다양한 식물들이 조화를 이루어 제주 곶자왈을 만드는 것처럼 다양하고 개성 있는 홉을 블렌딩하여 반짝이는 시트러스향을 느낄 수 있는 제주스러운 페일 에일입니다.", 0.0, 5.5)
    )

    init {
        getRatingData()
    }

    private fun getRatingData() {
        RetrofitService.getInstance().getDrinkInfo().enqueue(
                CallBack { throwable, response ->
                    throwable?.let { Log.d("err", throwable.message) }
                    response?.let {
                        val resultList = response.body()

                        if (resultList != null) {
                            alcoholList.forEachIndexed { index, element ->
                                element.rating = resultList[index].rating
                            }
                        }
                    }
                }
        )
    }
}