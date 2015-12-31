--
-- PostgreSQL database dump
--

-- Dumped from database version 9.3.9
-- Dumped by pg_dump version 9.4.0
-- Started on 2015-12-30 22:53:02

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 172 (class 3079 OID 12643)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2835 (class 0 OID 0)
-- Dependencies: 172
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 171 (class 1259 OID 753584)
-- Name: main; Type: TABLE; Schema: public; Owner: yygnxivbnbtjqp; Tablespace: 
--

CREATE TABLE main (
    id smallint NOT NULL,
    song_name character varying(300) NOT NULL,
    link character varying(300),
    experimental bit(1),
    house_influenced bit(1),
    hip_hop_influenced bit(1),
    indie_influenced bit(1),
    deep_house bit(1),
    hip_hop bit(1),
    indie bit(1),
    heavy_sub_bass bit(1),
    poppy bit(1),
    energetic bit(1),
    calm bit(1),
    ethereal bit(1),
    jazz_influenced bit(1),
    trap_influenced bit(1),
    rnb_influenced bit(1),
    funk_influenced bit(1),
    old_school_vibes bit(1),
    male_vocals bit(1),
    female_vocals bit(1),
    heavy_vocal_manipulation bit(1),
    instrumental bit(1),
    ambient bit(1),
    aggressive bit(1)
);


ALTER TABLE main OWNER TO yygnxivbnbtjqp;

--
-- TOC entry 170 (class 1259 OID 753582)
-- Name: main_id_seq; Type: SEQUENCE; Schema: public; Owner: yygnxivbnbtjqp
--

CREATE SEQUENCE main_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE main_id_seq OWNER TO yygnxivbnbtjqp;

--
-- TOC entry 2836 (class 0 OID 0)
-- Dependencies: 170
-- Name: main_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: yygnxivbnbtjqp
--

ALTER SEQUENCE main_id_seq OWNED BY main.id;


--
-- TOC entry 2716 (class 2604 OID 753587)
-- Name: id; Type: DEFAULT; Schema: public; Owner: yygnxivbnbtjqp
--

ALTER TABLE ONLY main ALTER COLUMN id SET DEFAULT nextval('main_id_seq'::regclass);


--
-- TOC entry 2827 (class 0 OID 753584)
-- Dependencies: 171
-- Data for Name: main; Type: TABLE DATA; Schema: public; Owner: yygnxivbnbtjqp
--

INSERT INTO main VALUES (17, 'Alle Farben - She Moves feat. Graham Candy (Hippie Sabotage Remix) ', 'https://www.youtube.com/watch?v=MztnUHMFLaU&index=20&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (5, 'Tom Misch & Carmody - So Close (Wild Culture Remix) ', 'https://www.youtube.com/watch?v=RDvwHjwU-uY&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=5', B'1', B'1', B'0', B'1', B'1', B'0', B'0', B'0', B'1', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (6, 'Flight Facilities - Two Bodies feat. Emma Louise (Lido Remix)
', 'https://www.youtube.com/watch?v=z0nL2ZApH2Y&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=6', B'1', B'0', B'0', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (3, 'Sir Sly - You Haunt Me (AMTRAC Remix) ', 'https://www.youtube.com/watch?v=INTe594lJw0&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=3', B'1', B'1', B'0', B'1', B'0', B'0', B'0', B'1', B'1', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0');
INSERT INTO main VALUES (12, 'MØ - Don''t Wanna Dance (Phazz Remix)', 'https://www.youtube.com/watch?v=pwOX_G-VUdQ&index=15&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'0');
INSERT INTO main VALUES (4, 'Blackbear - Playing Dead (SevnthWonder Remix)', 'https://www.youtube.com/watch?v=kDF-JPle3_A&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=4', B'1', B'1', B'1', B'0', B'1', B'0', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'1', B'0', B'1', B'0', B'0', B'1');
INSERT INTO main VALUES (7, 'Slumberjack - Body Cry feat. Father Dude ', 'https://www.youtube.com/watch?v=ip9NLvm8Ck4&index=7&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'1');
INSERT INTO main VALUES (8, 'Bearcubs - Touch', 'https://www.youtube.com/watch?v=6J_ZltM51wg&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=8', B'1', B'1', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (9, 'BADBADNOTGOOD - Kaleidoscope (Kaytranada''s Flip)
', 'https://www.youtube.com/watch?v=_T8ve7GfJGY&index=12&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'1', B'0');
INSERT INTO main VALUES (10, 'The Knocks - Classic (Powers'' Sunset Mix) ', 'https://www.youtube.com/watch?v=WOrHUNRNAWI&index=13&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (11, 'HWLS - 004 (feat. Noah Breakfast) ', 'https://www.youtube.com/watch?v=miXYHRVWGaU&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=14', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'1');
INSERT INTO main VALUES (13, 'FYFE - Holding On (Favela Remix)', 'https://www.youtube.com/watch?v=W0CE6Yo7qdM&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=16', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'1', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (14, 'Shakka - When Will I See You Again (AMTRAC Remix) ', 'https://www.youtube.com/watch?v=E-4Dtd6mC-c&index=17&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (15, 'Lights - Up We Go (Knight One Remix) ', 'https://www.youtube.com/watch?v=MYFeBHKkjdw&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=18', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'1');
INSERT INTO main VALUES (16, 'Wayward - Waver feat. Elderbrook', 'https://www.youtube.com/watch?v=xXKSKPI8sdM&index=19&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'1', B'1', B'0');
INSERT INTO main VALUES (22, 'Saje (Mazego & Vitesse) - Lost Tonight', 'https://www.youtube.com/watch?v=H7LATcgcWPQ&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=25', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'1', B'0', B'0', B'0');
INSERT INTO main VALUES (18, 'Les Sins - Why feat. Nate Salman', 'https://www.youtube.com/watch?v=dhWfKlja7Ys&index=21&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (19, 'Ludacris - Stand Up (LeMarquis Remix) ', 'https://www.youtube.com/watch?v=BJxrOW6m0u0&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=22', B'1', B'1', B'1', B'0', B'1', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'1', B'1', B'0', B'0', B'0', B'1');
INSERT INTO main VALUES (20, 'Chris Malinchak - Happiness feat. MNEK', 'https://www.youtube.com/watch?v=j1eBEzAK5tk&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=23', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'1', B'0', B'0', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0');
INSERT INTO main VALUES (21, 'Kero Kero Bonito - Flamingo ', 'https://www.youtube.com/watch?v=LMdrk-vCACI&index=24&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'1');
INSERT INTO main VALUES (23, 'Sango - When I''m Around U', 'https://www.youtube.com/watch?v=GkduKJrN1A4&index=26&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'0', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'1', B'1', B'1', B'1');
INSERT INTO main VALUES (24, 'Bipolar Sunshine - Future (Part 1) feat. GoldLink', 'https://www.youtube.com/watch?v=V99dpwLgf5o&index=27&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'1', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (25, 'James Vincent McMorrow - Glacier (Atu Remix) ', 'https://www.youtube.com/watch?v=wzjIFrsFHEQ&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=28', B'1', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0');
INSERT INTO main VALUES (26, 'Rubblebucket - Sound of Erasing (Chrome Sparks Remix) ', 'https://www.youtube.com/watch?v=qBFONsOl0Gk&index=29&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'0', B'1', B'0', B'0', B'1', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'1');
INSERT INTO main VALUES (1, 'ZHU - Paradise Awaits (FKJ Remix)', 'https://www.youtube.com/watch?v=K603Xt_rd2c&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=1', B'1', B'1', B'0', B'1', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (28, 'LANY - ILYSB (Ferdinand Weber Remix) ', 'https://www.youtube.com/watch?v=Hj2o_kGMbcg&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=32', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'1', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (29, 'Vic Mensa - Wimme Nah (Prod. by Kaytranada)
', 'https://www.youtube.com/watch?v=QTOn91OeMbw&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=33', B'1', B'0', B'1', B'0', B'0', B'1', B'0', B'1', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'1');
INSERT INTO main VALUES (30, 'Mura Masa - Miss You ', 'https://www.youtube.com/watch?v=90fRR8vHoM0&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=34', B'1', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'0');
INSERT INTO main VALUES (31, 'Sango - Me dê Amor', 'https://www.youtube.com/watch?v=PrunO4Nh_k0&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=35', B'1', B'0', B'1', B'0', B'0', B'1', B'0', B'1', B'0', B'1', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'1', B'1', B'0', B'1');
INSERT INTO main VALUES (32, 'Dear David - I''ve Been Waiting ', 'https://www.youtube.com/watch?v=_jH0iay-8Y8&index=36&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'1');
INSERT INTO main VALUES (27, 'ODESZA - Sun Models (feat. Madelyn Grant) ', 'https://www.youtube.com/watch?v=pnSZbl8fTHM&index=30&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'1', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'1', B'1', B'0', B'0');
INSERT INTO main VALUES (33, 'Phil Gerus - Voice To Voice Lip To Lip ', 'https://www.youtube.com/watch?v=21sjcSmfe6M&index=45&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'1', B'1', B'1', B'0', B'1', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (34, 'BABE - Make It Real (Vestige Remix)', 'https://www.youtube.com/watch?v=OzdHPiBHEW4&index=46&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (35, 'Imprintafter - Every Time I Close My Eyes ', 'https://www.youtube.com/watch?v=K0N2TbGdvRY&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=47', B'1', B'0', B'1', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'1', B'0');
INSERT INTO main VALUES (36, 'JUCE! - Call You Out ', 'https://www.youtube.com/watch?v=JIfeguOnPJY&index=49&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'1', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (37, 'Submotion Orchestra - City Lights (Radio Edit)', 'https://www.youtube.com/watch?v=ZeaA7mJZne4&index=50&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'0', B'1', B'0', B'0', B'1', B'0', B'1', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (38, 'Busta Rhymes - Ill Vibe (Tom Misch Remix) ', 'https://www.youtube.com/watch?v=2ZHcap-EWo4&index=51&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'1', B'0', B'1', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (39, 'James Vincent McMorrow - Cavalier (MOORS Remix) ', 'https://www.youtube.com/watch?v=tcncLEZfaos&index=52&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'1', B'1', B'0', B'1', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (40, 'Rude - Disco ', 'https://www.youtube.com/watch?v=_IhI1KEvdaQ&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=53', B'1', B'0', B'0', B'1', B'0', B'0', B'1', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (41, 'Golden Coast - Break My Fall (Rainer & Grimm Remix) ', 'https://www.youtube.com/watch?v=j1hWXU7vs9Q&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=54', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (42, 'Lido - Lost feat. Muri (Stwo Remix) ', 'https://www.youtube.com/watch?v=DyfKwOkOBj8&index=55&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'1', B'0', B'0', B'1');
INSERT INTO main VALUES (43, 'Paradis - Garde Le Pour Toi ', 'https://www.youtube.com/watch?v=l9NnukHxmzY&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=56', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (44, 'Kid Astray - Taking You With Me (Alizzz Remix) ', 'https://www.youtube.com/watch?v=5gyCwiRcnDs&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=57', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (45, 'Elder Island - The Big Unknown ', 'https://www.youtube.com/watch?v=MS9DY0P7HPE&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=58', B'1', B'1', B'0', B'1', B'0', B'0', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (46, 'TV Girl - Birds Don''t Sing', 'https://www.youtube.com/watch?v=jLwEUBdez_0&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=59', B'1', B'1', B'0', B'1', B'0', B'0', B'1', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (47, 'Zimmer feat. KLP - Sensify Me (Crayon Remix)', 'https://www.youtube.com/watch?v=c-odWnPpOsY&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=60', B'1', B'1', B'1', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'1', B'1', B'0', B'1', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (48, 'Sango & Waldo - Crossroads (feat. SPZRKT) ', 'https://www.youtube.com/watch?v=LA2c4X9C-yU&index=61&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'0', B'1', B'0', B'0', B'1', B'0', B'1', B'0', B'0', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (49, 'DIVERSA - Do You ', 'https://www.youtube.com/watch?v=0k0hxzEzJno&index=62&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'1', B'0', B'0', B'0', B'0', B'1', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'1', B'1', B'1', B'0', B'1');
INSERT INTO main VALUES (50, 'Snakehips - Days With You (feat. Sinead Harnett)', 'https://www.youtube.com/watch?v=kA2BSluxql8&index=63&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'0', B'1', B'1', B'0', B'0', B'1', B'0', B'1', B'1', B'0', B'0', B'1', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (51, 'Signatvre - Windwhisper (LeMarquis Remix) ', 'https://www.youtube.com/watch?v=LVXT2bCobXc&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=64', B'1', B'1', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'1', B'0', B'0', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'1');
INSERT INTO main VALUES (52, 'Mizan - Thru ', 'https://www.youtube.com/watch?v=4JrDegiJ4is&index=65&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (53, 'Pomo - Start Again ft. Andrea Cormier', 'https://www.youtube.com/watch?v=1NywYOLD7L8&index=66&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'1', B'0', B'1');
INSERT INTO main VALUES (54, 'Les Loups ft. Cybil - Colourblind (Original Mix) ', 'https://www.youtube.com/watch?v=fBg23wQwP2o&index=67&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'1', B'0', B'1', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (55, 'Gorgon City - Here For You (Bearcubs Remix)', 'https://www.youtube.com/watch?v=NBO-BZGwAoc&index=68&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (56, 'Lana Del Rey - West Coast (ZHU Remix) ', 'https://www.youtube.com/watch?v=eAg5QHqrqIM&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=69', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'1');
INSERT INTO main VALUES (57, 'Harrison - Akira (Official Music Video) ', 'https://www.youtube.com/watch?v=56BvDscWdQk&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=70', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'1');
INSERT INTO main VALUES (58, 'Pharrell Williams ft. Jay Z - Frontin'' (Disclosure Rework) ', 'https://www.youtube.com/watch?v=iNAMI8DQc8M&index=71&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'1', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (59, '20syl - Ongoing Thing feat. Oddisee
', 'https://www.youtube.com/watch?v=Xkm8mGlfm9w&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=72', B'1', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'1');
INSERT INTO main VALUES (60, 'AlunaGeorge - Superstar (Cosmo''s Midnight x Lido Remix)', 'https://www.youtube.com/watch?v=1mIBXtAlfiQ&index=73&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (61, 'Gucci Mane - Party Animal (Hudson Mohawke Remix) ', 'https://www.youtube.com/watch?v=_TgVALvy00Y&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=74', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (62, 'Joe Hertz - Isolate feat. Kaleem Taylor', 'https://www.youtube.com/watch?v=TkBIPFeIM-c&index=75&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'1', B'0', B'1', B'0', B'0', B'1');
INSERT INTO main VALUES (63, 'HONNE - The Night', 'https://www.youtube.com/watch?v=edhAx-p0qKY&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=12', B'1', B'1', B'0', B'1', B'0', B'0', B'1', B'0', B'1', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (64, 'Zola Blood - Meridian (Applescal Remix)', 'https://www.youtube.com/watch?v=HBUifB7oqG8&index=11&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'0', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (65, 'TAPES - Tried To ', 'https://www.youtube.com/watch?v=56iKAyvoBpE&index=10&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'1', B'1', B'1', B'0', B'0', B'0');
INSERT INTO main VALUES (66, 'Abhi//Dijon - ECS ', 'https://www.youtube.com/watch?v=KQ_pkK7S-sw&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=9', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'1', B'0', B'0', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (68, 'AlunaGeorge - Supernatural (Pomo Remix) ', 'https://www.youtube.com/watch?v=UTYMHYG5P9E&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=7', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'1');
INSERT INTO main VALUES (67, 'Atu - Vacant', 'https://www.youtube.com/watch?v=Fi6uwdykN2Y&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=8', B'1', B'1', B'1', B'1', B'0', B'0', B'0', B'1', B'0', B'0', B'1', B'1', B'1', B'0', B'1', B'0', B'0', B'1', B'0', B'1', B'0', B'1', B'0');
INSERT INTO main VALUES (69, 'Moi je - Fais Rien ', 'https://www.youtube.com/watch?v=7CqayVPbw_U&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=6', B'1', B'1', B'0', B'1', B'1', B'0', B'1', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (70, 'Mura Masa - ill be alright (tonight) ', 'https://www.youtube.com/watch?v=au2EuGFi2bo&index=5&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'1', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'1', B'1', B'1', B'0', B'1', B'0', B'0', B'1', B'0', B'1', B'0', B'1', B'0');
INSERT INTO main VALUES (71, 'KOA - All Of My Love', 'https://www.youtube.com/watch?v=2WElaHfmEaQ&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=4', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'1', B'0', B'1', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'1');
INSERT INTO main VALUES (72, 'Manila Killa - 2h Du Matin (feat. Mark Johns) ', 'https://www.youtube.com/watch?v=6oqcl-d97IQ&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=3', B'1', B'1', B'0', B'0', B'1', B'0', B'0', B'1', B'0', B'0', B'0', B'1', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'1', B'0');
INSERT INTO main VALUES (73, 'Montgomery - Piñata (Japanese Wallpaper Remix) ', 'https://www.youtube.com/watch?v=Gmci_ylrMVA&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE&index=2', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'1', B'0', B'0', B'0');
INSERT INTO main VALUES (74, 'Favela - Gong', 'https://www.youtube.com/watch?v=QKyM9_LvTSM&index=1&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'0', B'1', B'0', B'0', B'1', B'0', B'1', B'0', B'1', B'1', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');
INSERT INTO main VALUES (2, 'HONNE - The Night ', 'https://www.youtube.com/watch?v=edhAx-p0qKY&list=PLGznEl712WelTl4KQuwsp7V_A6bKna0TE', B'1', B'1', B'0', B'1', B'0', B'0', B'0', B'0', B'1', B'0', B'1', B'0', B'0', B'0', B'0', B'0', B'0', B'1', B'0', B'0', B'0', B'0', B'0');


--
-- TOC entry 2837 (class 0 OID 0)
-- Dependencies: 170
-- Name: main_id_seq; Type: SEQUENCE SET; Schema: public; Owner: yygnxivbnbtjqp
--

SELECT pg_catalog.setval('main_id_seq', 3, true);


--
-- TOC entry 2718 (class 2606 OID 753649)
-- Name: main_pkey; Type: CONSTRAINT; Schema: public; Owner: yygnxivbnbtjqp; Tablespace: 
--

ALTER TABLE ONLY main
    ADD CONSTRAINT main_pkey PRIMARY KEY (song_name);


--
-- TOC entry 2834 (class 0 OID 0)
-- Dependencies: 6
-- Name: public; Type: ACL; Schema: -; Owner: yygnxivbnbtjqp
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM yygnxivbnbtjqp;
GRANT ALL ON SCHEMA public TO yygnxivbnbtjqp;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2015-12-30 22:53:06

--
-- PostgreSQL database dump complete
--

