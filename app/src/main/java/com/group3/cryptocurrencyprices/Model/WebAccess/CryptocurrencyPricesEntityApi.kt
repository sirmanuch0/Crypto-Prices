package com.group3.cryptocurrencyprices.Model.WebAccess

data class CryptocurrencyPricesEntityApi(
    val community_data: CommunityData,
    val developer_data: DeveloperData,
    val id: String,
    val image: Image,
    val localization: Localization,
    val market_data: MarketData,
    val name: String,
    val public_interest_stats: PublicInterestStats,
    val symbol: String
)

data class CommunityData(
    val facebook_likes: Any,
    val reddit_accounts_active_48h: String,
    val reddit_average_comments_48h: Double,
    val reddit_average_posts_48h: Double,
    val reddit_subscribers: Int,
    val twitter_followers: Int
)

data class DeveloperData(
    val closed_issues: Int,
    val code_additions_deletions_4_weeks: CodeAdditionsDeletions4Weeks,
    val commit_count_4_weeks: Int,
    val forks: Int,
    val pull_request_contributors: Int,
    val pull_requests_merged: Int,
    val stars: Int,
    val subscribers: Int,
    val total_issues: Int
)

data class Image(
    val small: String,
    val thumb: String
)

data class Localization(
    val ar: String,
    val bg: String,
    val cs: String,
    val da: String,
    val de: String,
    val el: String,
    val en: String,
    val es: String,
    val fi: String,
    val fr: String,
    val he: String,
    val hi: String,
    val hr: String,
    val hu: String,
    val id: String,
    val `it`: String,
    val ja: String,
    val ko: String,
    val lt: String,
    val nl: String,
    val no: String,
    val pl: String,
    val pt: String,
    val ro: String,
    val ru: String,
    val sk: String,
    val sl: String,
    val sv: String,
    val th: String,
    val tr: String,
    val uk: String,
    val vi: String,
    val zh: String,
    val `zh-tw`: String
)

data class MarketData(
    val current_price: CurrentPrice,
    val market_cap: MarketCap,
    val total_volume: TotalVolume
)

data class PublicInterestStats(
    val alexa_rank: Int,
    val bing_matches: Any
)

data class CodeAdditionsDeletions4Weeks(
    val additions: Int,
    val deletions: Int
)

data class CurrentPrice(
    val aed: Double,
    val ars: Double,
    val aud: Double,
    val bch: Double,
    val bdt: Double,
    val bhd: Double,
    val bits: Double,
    val bmd: Double,
    val bnb: Double,
    val brl: Double,
    val btc: Double,
    val cad: Double,
    val chf: Double,
    val clp: Double,
    val cny: Double,
    val czk: Double,
    val dkk: Double,
    val dot: Double,
    val eos: Double,
    val eth: Double,
    val eur: Double,
    val gbp: Double,
    val hkd: Double,
    val huf: Double,
    val idr: Double,
    val ils: Double,
    val inr: Double,
    val jpy: Double,
    val krw: Double,
    val kwd: Double,
    val link: Double,
    val lkr: Double,
    val ltc: Double,
    val mmk: Double,
    val mxn: Double,
    val myr: Double,
    val ngn: Double,
    val nok: Double,
    val nzd: Double,
    val php: Double,
    val pkr: Double,
    val pln: Double,
    val rub: Double,
    val sar: Double,
    val sats: Double,
    val sek: Double,
    val sgd: Double,
    val thb: Double,
    val `try`: Double,
    val twd: Double,
    val uah: Double,
    val usd: Double,
    val vef: Double,
    val vnd: Double,
    val xag: Double,
    val xau: Double,
    val xdr: Double,
    val xlm: Double,
    val xrp: Double,
    val yfi: Double,
    val zar: Double
)

data class MarketCap(
    val aed: Double,
    val ars: Double,
    val aud: Double,
    val bch: Double,
    val bdt: Double,
    val bhd: Double,
    val bits: Double,
    val bmd: Double,
    val bnb: Double,
    val brl: Double,
    val btc: Double,
    val cad: Double,
    val chf: Double,
    val clp: Double,
    val cny: Double,
    val czk: Double,
    val dkk: Double,
    val dot: Double,
    val eos: Double,
    val eth: Double,
    val eur: Double,
    val gbp: Double,
    val hkd: Double,
    val huf: Double,
    val idr: Double,
    val ils: Double,
    val inr: Double,
    val jpy: Double,
    val krw: Double,
    val kwd: Double,
    val link: Double,
    val lkr: Double,
    val ltc: Double,
    val mmk: Double,
    val mxn: Double,
    val myr: Double,
    val ngn: Double,
    val nok: Double,
    val nzd: Double,
    val php: Double,
    val pkr: Double,
    val pln: Double,
    val rub: Double,
    val sar: Double,
    val sats: Double,
    val sek: Double,
    val sgd: Double,
    val thb: Double,
    val `try`: Double,
    val twd: Double,
    val uah: Double,
    val usd: Double,
    val vef: Double,
    val vnd: Double,
    val xag: Double,
    val xau: Double,
    val xdr: Double,
    val xlm: Double,
    val xrp: Double,
    val yfi: Double,
    val zar: Double
)

data class TotalVolume(
    val aed: Double,
    val ars: Double,
    val aud: Double,
    val bch: Double,
    val bdt: Double,
    val bhd: Double,
    val bits: Double,
    val bmd: Double,
    val bnb: Double,
    val brl: Double,
    val btc: Double,
    val cad: Double,
    val chf: Double,
    val clp: Double,
    val cny: Double,
    val czk: Double,
    val dkk: Double,
    val dot: Double,
    val eos: Double,
    val eth: Double,
    val eur: Double,
    val gbp: Double,
    val hkd: Double,
    val huf: Double,
    val idr: Double,
    val ils: Double,
    val inr: Double,
    val jpy: Double,
    val krw: Double,
    val kwd: Double,
    val link: Double,
    val lkr: Double,
    val ltc: Double,
    val mmk: Double,
    val mxn: Double,
    val myr: Double,
    val ngn: Double,
    val nok: Double,
    val nzd: Double,
    val php: Double,
    val pkr: Double,
    val pln: Double,
    val rub: Double,
    val sar: Double,
    val sats: Double,
    val sek: Double,
    val sgd: Double,
    val thb: Double,
    val `try`: Double,
    val twd: Double,
    val uah: Double,
    val usd: Double,
    val vef: Double,
    val vnd: Double,
    val xag: Double,
    val xau: Double,
    val xdr: Double,
    val xlm: Double,
    val xrp: Double,
    val yfi: Double,
    val zar: Double
)